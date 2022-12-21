package ru.maksim.ikbo2021.new_pracs.prac_22.ex_2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalculatorController extends JFrame {
    public CalculatorController() {
        super("calculator");
        this.setSize(200, 300);
        final CalculatorView view = new CalculatorView((JPanel)this.getContentPane());
        final CalculatorModel model = new CalculatorModel();
        ActionListener btnActionListenter = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().charAt(0) == '=') {
                    model.setUserInput(view.getUserInput());

                    try {
                        model.fromPolandToNormal();
                    } catch (EmptyStackException var3) {
                        CalculatorController.this.clear(model, view);
                        view.showAlertDialog(var3.getMessage());
                    } catch (DivisionByZeroException var4) {
                        CalculatorController.this.clear(model, view);
                        view.showAlertDialog(var4.getMessage());
                    } catch (EmptyStringException var5) {
                        CalculatorController.this.clear(model, view);
                        view.showAlertDialog(var5.getMessage());
                    } catch (DoubleParseException var6) {
                        CalculatorController.this.clear(model, view);
                        view.showAlertDialog(var6.getMessage());
                    }

                    view.setTextUserInputField(model.getResult());
                } else if (e.getActionCommand().charAt(0) == 'C') {
                    CalculatorController.this.clear(model, view);
                } else {
                    CalculatorView var10000;
                    String var10001;
                    if (e.getActionCommand().charAt(0) == '.') {
                        if (view.getUserInput().length() != 0 && model.isOperand(Character.valueOf(view.getUserInput().charAt(view.getUserInput().length() - 1)).toString())) {
                            view.showAlertDialog("Wrong place for dot! Retry with another expression");
                            CalculatorController.this.clear(model, view);
                        }

                        var10000 = view;
                        var10001 = view.getUserInput();
                        var10000.setTextUserInputField(var10001 + e.getActionCommand());
                    } else if (view.getUserInput().length() == 0 && e.getActionCommand().charAt(0) == '.') {
                        view.showAlertDialog("Wrong place for dot! Retry with another expression");
                    } else if (view.getUserInput().length() != 0 && view.getUserInput().charAt(view.getUserInput().length() - 1) == '.') {
                        var10000 = view;
                        var10001 = view.getUserInput();
                        var10000.setTextUserInputField(var10001 + e.getActionCommand());
                    } else {
                        var10000 = view;
                        var10001 = view.getUserInput();
                        var10000.setTextUserInputField(var10001 + " " + e.getActionCommand());
                    }
                }

            }
        };
        view.setActionListener(btnActionListenter);
        this.setVisible(true);
    }

    private void clear(CalculatorModel model, CalculatorView view) {
        model.setResult("");
        model.setUserInput("");
        view.setTextUserInputField("");
    }
}
