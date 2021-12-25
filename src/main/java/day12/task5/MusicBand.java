package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void addMember(MusicArtist newMember) {
        if (!members.contains(newMember)) {
            members.add(newMember);
        } else {
            System.out.println("Участник " + newMember + " не может быть добавлен, так как уже состоит в группе " + name);
        }
    }

    public void removeMember(MusicArtist memberToBeRemoved) {
        if (members.contains(memberToBeRemoved)) {
            members.remove(memberToBeRemoved);
        } else {
            System.out.println("Участник " + memberToBeRemoved + " не может быть удален, так как не состоит в группе " + name);
        }
    }

    public static void transferMembers(MusicBand givingBand, MusicBand hostBand) {
        // добавление по одному, чтобы предотвартить дубликаты участников.
        // например, для случая, если один участник был изначально в двух группах.
        for (MusicArtist musicArtist : givingBand.getMembers()) {
            hostBand.addMember(musicArtist);
        }

        // удаляем всех участников из первой группы (для успешного прохождения теста)
        givingBand.getMembers().clear();
    }

    public void printMembers() {
        System.out.println("Состав группы " + name + ": " + members);
    }

    @Override
    public String toString() {
        return name + " " + year;
    }
}
