package com.github.arocketman.corejava;

public class EqualsAndHashcode {

    public class Dog{
        String name;
        Integer age;
        String sex;

        public Dog(String name, Integer age, String sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Dog dog = (Dog) o;

            if (!name.equals(dog.name)) return false;
            if (age != null ? !age.equals(dog.age) : dog.age != null) return false;
            return sex.equals(dog.sex);

        }

        @Override
        public int hashCode() {
            int result = name.hashCode();
            result = 31 * result + (age != null ? age.hashCode() : 0);
            result = 31 * result + sex.hashCode();
            return result;
        }
    }

}
