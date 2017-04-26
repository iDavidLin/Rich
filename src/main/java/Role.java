public class Role {

    public String Name;

    enum PlayRole {
        QianFuren(1), ATuBo(2), SunXiaomei(3), JinBeibei(4);

        private final int Index;

        PlayRole(int index) {
            this.Index = index;
        }

        public int getIndex() {
            return Index;
        }
    }

    public Role(int role) {
        if (0 < role && role < 5) {
            this.Name = PlayRole.values()[role - 1].toString();
        }
    }
}
