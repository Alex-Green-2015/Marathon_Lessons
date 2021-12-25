package day12.task5;

public class MusicArtist {
    private String name;
    private Integer age;

    public MusicArtist(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    // переопределяем метод equals для сравнения двух музыкантов
    // стандартная реализация, сгенерированная средой IDEA
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MusicArtist)) return false;

        MusicArtist that = (MusicArtist) o;

        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        return getAge() != null ? getAge().equals(that.getAge()) : that.getAge() == null;
    }

    // стандартная реализация, сгенерированная средой IDEA
    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getAge() != null ? getAge().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return name;
    }

}
