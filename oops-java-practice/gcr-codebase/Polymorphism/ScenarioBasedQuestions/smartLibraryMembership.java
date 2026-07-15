class LibraryMember {
    private String memberName;
    private String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0.0;
    }

    public void printDetails(int overdueDays) {
        System.out.println("ID: " + memberId + " | Name: " + memberName + " | Type: " + getClass().getSimpleName() + " | Fine: $" + calculateFine(overdueDays));
    }
}

class StudentMember extends LibraryMember {
    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1.0;
    }
}

class FacultyMember extends LibraryMember {
    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 0.5;
    }
}

class GuestMember extends LibraryMember {
    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5.0;
    }
}

public class smartLibraryMembership {
    public static void searchMember(LibraryMember[] members, String id, int overdueDays) {
        for (LibraryMember m : members) {
            if (m.getMemberId().equalsIgnoreCase(id)) {
                System.out.println("\nMember Found:");
                m.printDetails(overdueDays);
                return;
            }
        }
        System.out.println("\nMember with ID " + id + " not found.");
    }

    public static void main(String[] args) {
        LibraryMember[] members = new LibraryMember[3];
        members[0] = new StudentMember("Alice", "S001");
        members[1] = new FacultyMember("Dr. Bob", "F001");
        members[2] = new GuestMember("Charlie", "G001");

        int overdueDays = 10;
        System.out.println("Library Member Details:");
        for (LibraryMember m : members) {
            m.printDetails(overdueDays);
        }

        searchMember(members, "F001", overdueDays);
        searchMember(members, "XYZ", overdueDays);
    }
}
