public abstract class Poupee {

    private int taille;
    private boolean isOpen;

    public Poupee(int taille, boolean isOpen) {
        this.taille = taille;
        this.isOpen=isOpen;
    }

    public abstract void open();

    public abstract void close();

    public abstract void placeIn(Poupee p);

    public abstract void getOutOf(Poupee p);

    public int getTaille() {
        return taille;
    }

    public int setTaille(int taille) {
        this.taille = taille;
        return taille;
    }

    public boolean isOpen(){
        return isOpen;
    }

    public void setOpen(boolean isOpen){
        this.isOpen = isOpen;
    }

}