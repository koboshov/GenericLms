package com.company;
public class Box <T>{


        private T name;
        private T age;

        public Box(T name, T age) {
            this.name = name;
            this.age = age;
        }
        public T getName() {
            return name;
        }
        public T getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "name=" + name +
                    ", age=" + age +
                    '}';
        }

        public static Box Generic(){
            Box<Integer>box=new Box("Hadicha",18);
            return box;

        }

    }

