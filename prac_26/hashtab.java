package ru.maksim.ikbo2021.new_pracs.prac_26;

public class hashtab {
    int realSize;
    int currentSize;
    Element[] table;

    public hashtab() {
    }

    private Integer hashtabHash(int iKey) {
        return iKey % this.currentSize;
    }

    public void hashtabInit() {
        this.realSize = 0;
        this.currentSize = 8;
        this.table = new Element[this.currentSize];
    }

    public void hashtabAdd(int key, String value) {
        int iPlace = this.hashtabHash(key);
        ++this.realSize;
        if ((double)this.realSize > (double)this.currentSize * 0.75D) {
            this.hashtabResize(this.currentSize * 2);
        }

        if (this.table[iPlace] == null) {
            this.table[iPlace] = new Element(key, value);
        } else {
            Element tmp;
            for(tmp = this.table[iPlace]; tmp.next != null; tmp = tmp.next) {
            }

            tmp.addNext(new Element(key, value));
        }

    }

    public void hashtabDelete(int key) {
        --this.realSize;
        int iPlace = this.hashtabHash(key);
        if (this.table[iPlace].Key == key) {
            this.table[iPlace] = this.table[iPlace].next == null ? null : this.table[iPlace].next;
        } else if (this.table[iPlace] != null) {
            Element tmp;
            for(tmp = this.table[iPlace]; tmp.next != null && tmp.next.Key != key; tmp = tmp.next) {
            }

            tmp.next = null;
        }

    }

    public Element hashtabLookUp(int key) {
        Element res = this.table[this.hashtabHash(key)];
        if (res == null) {
            return null;
        } else if (res.Key == key) {
            return res;
        } else {
            while(res != null && res.Key != key) {
                res = res.next;
            }

            return res;
        }
    }

    private void hashtabResize(int newSize) {
        Element[] newTable = new Element[newSize];
        this.currentSize = newSize;
        Element[] var3 = this.table;
        int var4 = var3.length;

        for(int var5 = 0; var5 < var4; ++var5) {
            Element elem = var3[var5];
            if (elem != null) {
                int iPlace = this.hashtabHash(elem.Key);
                if (newTable[iPlace] == null) {
                    newTable[iPlace] = elem;
                } else {
                    Element tmp;
                    for(tmp = newTable[iPlace]; tmp.next != null; tmp = tmp.next) {
                    }

                    tmp.addNext(elem);
                }
            }
        }

        this.table = newTable;
    }
}
