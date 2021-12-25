package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember(String memberName) {
        if (!members.contains(memberName)) {
            members.add(memberName);
        } else {
            System.out.println("Участник " + memberName + " не может быть добавлен, так как уже состоит в группе " + name);
        }
    }

    public void removeMember(String memberName) {
        if (members.contains(memberName)) {
            members.remove(memberName);
        } else {
            System.out.println("Участник " + memberName + " не может быть удален, так как не состоит в группе " + name);
        }
    }

    public static void transferMembers(MusicBand givingBand, MusicBand hostBand) {
        // добавление по одному, чтобы предотвартить дубликаты участников.
        // например, для случая, если один участник был изначально в двух группах.
        for (String member : givingBand.getMembers()) {
            hostBand.addMember(member);
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
