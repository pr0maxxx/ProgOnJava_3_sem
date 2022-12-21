package ru.maksim.ikbo2021.new_pracs.prac_24;

import java.util.ArrayList;

public class CreateTextDocument implements ICreateDocument {
    ArrayList<IDocument> fabricFiles = new ArrayList();

    public CreateTextDocument() {
    }

    public IDocument CreateNew(String stFolder, String stName, int iSize) {
        IDocument newDocument = new TextDocument(stFolder, stName, iSize);
        this.fabricFiles.add(newDocument);
        return newDocument;
    }

    public IDocument CreateOpen(String stName) {
        return (IDocument)this.fabricFiles.stream().filter((IDocument) -> {
            return stName.equals(IDocument.getName());
        }).findFirst().orElse(new TextDocument());
    }
}
