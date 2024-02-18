class PoupeeRusse extends Poupee {

    private String name;

    private PoupeeRusse containDoll;
    private PoupeeRusse intoDoll;

    public PoupeeRusse getIntoDoll() {return intoDoll;}

    public void setIntoDoll(PoupeeRusse dol) {this.intoDoll = dol;}

    public PoupeeRusse getContainDoll() {return containDoll;}

    public void setContainDoll(PoupeeRusse p) {this.containDoll = p; }

    public PoupeeRusse(String name, boolean isOpen, int taille) {
        super(taille,isOpen);
        this.name=name;
        containDoll = null;
        intoDoll=null;
    }

    @Override
    public void open() {
        if (!isOpen()) {
            setOpen(true);
            System.out.println(this.name+" is open now");
        }else{
            System.out.println(this.name+" is already open!!");
        }
    }

    @Override
    public void close() {
        if (isOpen()) {
            setOpen(false);
            System.out.println(this.name+" is close now");
        }else{
            System.out.println(this.name+" is already close!!");
        }
    }

    @Override
    public void placeIn(Poupee P) {
        PoupeeRusse p=(PoupeeRusse) P;
        if (!P.isOpen()) {
            System.out.println("impossible, this "+p.name+" is close");
        } else if (p.getContainDoll()!=null){
            System.out.println("impossible, this "+p.name+" is Full");
        } else if (this.getIntoDoll() != null){
            System.out.println("this "+this.getName()+" deja dans la poupée "+this.getIntoDoll().getName());
        }   else if(this.getTaille() >= P.getTaille()) {
            System.out.println("impossible, this "+p.getName()+" is so small ");
        } else {
            //doll is alredy in another doll
            this.setIntoDoll(p);
            //doll mother is full
            p.setContainDoll(this);
            System.out.println(this.name+" est placee dans la poupee "+p.name);
        }
    }

    @Override
    public void getOutOf(Poupee P) {
        PoupeeRusse p=(PoupeeRusse) P;
        if (!P.isOpen()) {
            System.out.println("impossible, this "+p.name+" is closee");
        } else if(p.getContainDoll()==null) {
            System.out.println("impossible, this "+p.name+" is empty");
        }else if (this.getIntoDoll() == null){
            System.out.println("this "+this.getName()+" n'est jamais placer dans une autre!");
        }   else {
            //doll daughter is alredy in another doll
            this.setIntoDoll(null);
            //doll mother is full
            p.setContainDoll(null);
            System.out.println(this.name+" est placee out la poupee "+p.name);
        }
    }

    public String getName() {
        return name;
    }

}