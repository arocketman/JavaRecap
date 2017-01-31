package com.github.arocketman.corejava;

/**
 * Example of how to override equals and hashCode.
 * Notice that we are assuming that both name and sex must be not null, while age is nullable.
 * Thus, both in the equals and hashCode we will make sure that while the first two are indeed not null, the age Integer
 * could be null and hence the situation should be handled accordingly.
 * @see  com.github.arocketman.test.EqualsAndHashcodeTest
 */
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
