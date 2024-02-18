class PoupeeRusse extends Poupee {

    private String name;

    private PoupeeRusse intoPoupee;

    public PoupeeRusse getPoupee() {return intoPoupee;}

    public void setPoupee(PoupeeRusse poupee) {this.intoPoupee = poupee; }

    public PoupeeRusse(String name, boolean isOpen, int taille) {
        super(taille,isOpen);
        this.name=name;
        intoPoupee = null;
    }

    @Override
    public void open() {
        if (!isOpen()) {
            setOpen(true);
            System.out.println("doll is open now");
        }else{
            System.out.println("is already open!!");
        }
    }

    @Override
    public void close() {
        if (isOpen()) {
            setOpen(false);
            System.out.println("doll is close now");
        }else{
            System.out.println("Is already close!!");
        }
    }

    @Override
    public void placeIn(Poupee P) {
        PoupeeRusse p=(PoupeeRusse) P;
        if (!P.isOpen()) {
            System.out.println("impossible, this doll is close");
        } else if (intoPoupee!=null){
            System.out.println("impossible, this doll is Full");
        } else if(this.getTaille() >= P.getTaille()) {
            System.out.println("impossible, this doll is so small ");
        } else {
            ((PoupeeRusse) P).setPoupee(this);
            System.out.println("le poupee "+this.name+" est placee dans la poupee "+p.name);
        }
    }

    @Override
    public void getOutOf(Poupee P) {
        PoupeeRusse p=(PoupeeRusse) P;
        if (!P.isOpen()) {
            System.out.println("impossible, this doll is closee");
        } else if(intoPoupee==null) {
            System.out.println("impossible, this doll is empty");
        }else {
            setPoupee(null);
            System.out.println("le poupee"+this.name+" est placee out la poupee "+p.name);
        }
    }

    public String getName() {
        return name;
    }
}
