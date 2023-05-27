package org.academiadecodigo.bootcamp;

    public class Player {
        private String name;
        private Choice choice;

        public Player(String name) {
            this.name = name;
        }

        public void setChoice(Choice choice) {
            this.choice = choice;
        }

        public Choice getChoice() {
            return choice;
        }

        public String getName() {
            return name;
        }
    }


