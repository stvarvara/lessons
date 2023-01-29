public class Rectangle {
    int longueur ;
    int largeur ;
    int origine_x ;
    int origine_y ;
    void deplace(int x, int y) {
        this.origine_x = this.origine_x + x ;
        this.origine_y = this.origine_y + y ;
    }
    int surface() {
        return this.longueur * this.largeur ;
    }
}
