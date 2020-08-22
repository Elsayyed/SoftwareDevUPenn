package com.company;

    public class WhackAMole {
        public int score;
        public int molesLeft;
        public int attemptsLeft;
        public char[][] moleGrid;
        public int gridDimension;

        public WhackAMole(int numAttempts, int gridDimension){
            this.gridDimension = gridDimension;
            attemptsLeft = numAttempts;

            moleGrid = new char[gridDimension][gridDimension];
            for (int i = 0; i <gridDimension ; i++) {
                for (int j = 0; j <gridDimension ; j++) {
                    moleGrid[i][j] = '*';
                }
            }

        }

        public void setMolesNumber(int molesLeft) {
            this.molesLeft = molesLeft;
        }

        public boolean place(int x, int y){
            boolean flag = false;
            if (moleGrid[x][y] == '*'){
                moleGrid[x][y] = 'M';
                molesLeft++;
                flag = true;
            }
            return flag;
        }

        public void whack(int x, int y){
            if(moleGrid[x][y] != 'M') {
                attemptsLeft--;
            }
            else{
                moleGrid[x][y] = 'W';
                score++;
                attemptsLeft--;
                molesLeft--; //makes sense!!
            }
        }

        public void printGridToUser(){
            for (int i = 0; i <gridDimension ; i++) {
                for (int j = 0; j <gridDimension ; j++) {

                    if(moleGrid[i][j] != 'W'){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("W");
                    }
                }
                System.out.println();
            }
            System.out.println(molesLeft);
        }

        public void printGrid(){
            for (int i = 0; i <gridDimension; i++) {
                for (int j = 0; j <gridDimension; j++) {
                    if (moleGrid[i][j] == 'M'){
                        System.out.print("M");
                    }else if (moleGrid[i][j] == 'W'){
                        System.out.print("W");
                    }else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }