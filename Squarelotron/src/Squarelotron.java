public class Squarelotron{

    int[][] squarelotron;
    int size;

    public Squarelotron(int size){
        this.size=size;

        squarelotron = new int[size][size];

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                squarelotron[i][j] = size * (i) + j + 1;
            }
        }
    }


// Helper methods

    public void printSquarelotron(){
        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print(squarelotron[i][j]+" ");
            }
            System.out.println();
        }
    }


    public int[][] getSquarelotron() {
        return squarelotron;
    }

    public void setSquarelotron(int[][] squarelotron) {
        this.squarelotron = squarelotron;
    }

    public int maxRingsNumber(){
        int rings;
        if (this.size % 2 == 0)
            rings = this.size/2;
        else{
            rings = this.size/2 + 1;
        }
        return rings;
    }

    public void swap(Squarelotron squarelotronClone, int ring){
        int[][] temp = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                temp[i][j] = this.squarelotron[i][j];
            }
        }

        if (ring == 1) {
            for (int j = ring-1; j < size; j++) {
                //first row , last row swap
                squarelotronClone.squarelotron[0][j] = this.squarelotron[size - 1][j];
                squarelotronClone.squarelotron[size - 1][j] = temp[0][j];
            }
        }
        //first line and last line swap, in a middle ring

        else if (ring > 1 && squarelotronClone.maxRingsNumber() >= ring){
            for (int j = ring-1; j < size-(ring-1); j++) {
                squarelotronClone.squarelotron[ring-1][j] = this.squarelotron[size - (ring-1) - 1][j];
                squarelotronClone.squarelotron[size - (ring-1) - 1][j] = temp[ring-1][j];
            }
        }

        if (size > 2) {
            for (int j = 1 + (ring-1); j < (size/2); j++){
                squarelotronClone.squarelotron[j][ring - 1] = this.squarelotron[size-j-1 ][ring-1];
                squarelotronClone.squarelotron[size-j-1 ][ring-1] = temp[j][ring - 1];

                //ring is not going to be less than 1, either way.
                squarelotronClone.squarelotron[j][size - ring] = this.squarelotron[size-j-1][size - ring];
                squarelotronClone.squarelotron[size-j-1][size - ring] = temp[j][size - ring];
            }
        }

    }

    public String typeCheck(){
        String rings;
        if (this.size % 2 == 0)
            rings = "even";
        else{
            rings= "odd";
        }
        return rings;
    }

    public Squarelotron upsideDownFlip(int ring){

        Squarelotron squarelotronClone = new Squarelotron(size);

        if (ring > squarelotronClone.maxRingsNumber()){
            System.out.println("returning the clone as is, becasue ring exceeded max rings number.");
            return squarelotronClone;
        }

        squarelotronClone.swap(squarelotronClone,ring);

        return squarelotronClone;
    }

    Squarelotron mainDiagonalFlip(int ring){
        
    }

}
