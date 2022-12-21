package ru.maksim.ikbo2021.new_pracs.prac_19;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.MouseInputListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class LabClassUI extends JFrame {
    ArrayList<Student> students;

    public LabClassUI(ArrayList<Student> students) {
        super("Students table");
        this.setSize(1080, 720);
        this.students = students;
        final JPanel panelMain = new JPanel(new FlowLayout());
        JButton btnAddStudent = new JButton("Add");
        JButton btnRemoveStudent = new JButton("Remove");
        JButton btnFindStudent = new JButton("Find");
        panelMain.add(btnAddStudent);
        panelMain.add(btnRemoveStudent);
        panelMain.add(btnFindStudent);
        Object[] headers = new String[]{"Name", "Surname", "Speciality", "Course", "Group", "GPA score"};
        Object[][] arStudents = new String[students.size()][6];

        for(int i = 0; i < students.size(); ++i) {
            arStudents[i][0] = ((Student)students.get(i)).getName();
            arStudents[i][1] = ((Student)students.get(i)).getSurname();
            arStudents[i][2] = ((Student)students.get(i)).getSpeciality();
            arStudents[i][3] = ((Student)students.get(i)).getCourse().toString();
            arStudents[i][4] = ((Student)students.get(i)).getGroup();
            arStudents[i][5] = ((Student)students.get(i)).getGPAScore().toString();
        }

        final JTable tableStudents = new JTable(new DefaultTableModel(arStudents, headers)) {
            public boolean isCellEditable(int x, int y) {
                return false;
            }
        };
        final JTableHeader header = tableStudents.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);
        header.addMouseListener(new MouseInputListener() {
            public void mouseClicked(MouseEvent e) {
                int count = e.getClickCount();
                if (count == 2) {
                    if (header.getHeaderRect(2).contains(e.getX(), e.getY())) {
                        LabClassUI.this.sortStudents(new ComparatorBySpeciality(), tableStudents);
                    }

                    if (header.getHeaderRect(3).contains(e.getX(), e.getY())) {
                        LabClassUI.this.sortStudents(new ComparatorByCourse(), tableStudents);
                    }

                    if (header.getHeaderRect(4).contains(e.getX(), e.getY())) {
                        LabClassUI.this.sortStudents(new ComparatorByCourse(), tableStudents);
                    }

                    if (header.getHeaderRect(5).contains(e.getX(), e.getY())) {
                        LabClassUI.this.sortStudents(new CompareByGpa(), tableStudents);
                    }
                }

            }

            public void mousePressed(MouseEvent e) {
            }

            public void mouseReleased(MouseEvent e) {
            }

            public void mouseEntered(MouseEvent e) {
            }

            public void mouseExited(MouseEvent e) {
            }

            public void mouseDragged(MouseEvent e) {
            }

            public void mouseMoved(MouseEvent e) {
            }
        });
        btnAddStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    LabClassUI.this.addStudent(tableStudents);
                } catch (IllegalArgumentException var3) {
                    JOptionPane.showMessageDialog(panelMain, var3.getMessage());
                }

            }
        });
        btnRemoveStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                LabClassUI.this.removeStudent(tableStudents);
            }
        });
        btnFindStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    LabClassUI.this.findStudent();
                } catch (StudentNotFoundException var3) {
                    JOptionPane.showMessageDialog(LabClassUI.this.getContentPane(), var3.getMessage());
                }

            }
        });
        this.add(new JScrollPane(tableStudents), "Center");
        this.add(panelMain, "North");
        this.setVisible(true);
    }

    private void sortStudents(Comparator<Student> comp, JTable tableStudents) {
        this.students.sort(comp);
        DefaultTableModel dtm = (DefaultTableModel)tableStudents.getModel();

        for(int i = 0; i < this.students.size(); ++i) {
            dtm.removeRow(i);
            Student student = (Student)this.students.get(i);
            dtm.insertRow(i, new Object[]{student.getName(), student.getSurname(), student.getSpeciality(), student.getCourse(), student.getGroup(), student.getGPAScore()});
        }

    }

    private void findStudent() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите искомую Фамилию");

        for(int i = 0; i < this.students.size(); ++i) {
            if (((Student)this.students.get(i)).getSurname().equals(s)) {
                Object var10001 = this.students.get(i);
                JOptionPane.showMessageDialog(this, "Student was found: " + ((Student)var10001).toString());
                return;
            }
        }

        throw new StudentNotFoundException();
    }

    private void removeStudent(JTable studTable) {
        int c = studTable.getSelectedRowCount();
        if (c != 1) {
            JOptionPane.showMessageDialog(this, "Выберете ровно одну строку!");
        } else {
            c = studTable.getSelectedRow();
            this.students.remove(c);
            DefaultTableModel dtm = (DefaultTableModel)studTable.getModel();
            dtm.removeRow(c);
        }
    }

    private void addStudent(JTable tableStudents) throws IllegalArgumentException {
        String stName = JOptionPane.showInputDialog("Enter student name");
        String stSurname = JOptionPane.showInputDialog("Enter student surname");
        String stSpeciality = JOptionPane.showInputDialog("Enter speciality");
        String stGroup = JOptionPane.showInputDialog("Enter group");
        String stCourse = JOptionPane.showInputDialog("Enter course number");
        String stGPAScore = JOptionPane.showInputDialog("Enter GPA score");
        if (!stName.equals("") && !stSurname.equals("") && !stSpeciality.equals("") && !stGroup.equals("")) {
            int iCourse;
            int iGPAScore;
            try {
                iCourse = Integer.parseInt(stCourse);
                iGPAScore = Integer.parseInt(stGPAScore);
            } catch (NumberFormatException var11) {
                throw new NumberFormatException("Введенный формат не преобразуем");
            }

            this.students.add(new Student(stName, stSurname, stSpeciality, iCourse, stGroup, iGPAScore));
            DefaultTableModel dtm = (DefaultTableModel)tableStudents.getModel();
            dtm.addRow(new Object[]{stName, stSurname, stSpeciality, iCourse, stGroup, iGPAScore});
        } else {
            throw new EmptyStringException();
        }
    }
}
