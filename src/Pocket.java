public class Pocket {
    private Ringable ringable;
    private Pulp pulp;

    public Pocket(Ringable ringable, Pulp pulp) {
        this.ringable = ringable;
        this.pulp = pulp;
    }

    public Pocket(Pulp pulp) {
        this.pulp = pulp;
    }

    public Pocket(Ringable ringable) {
        this.ringable = ringable;
    }

    public Ringable getRingable() {
        return ringable;
    }

    public void setRingable(Ringable ringable) {
        this.ringable = ringable;
    }

    public Pulp getPulp() {
        return pulp;
    }

    public void setPulp(Pulp pulp) {
        this.pulp = pulp;
    }
}
