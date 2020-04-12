package percabangan;

public class Switch {
    public static void main(String[] args) {
        char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs   : \"Terima Kasih Pak\"");
                System.out.println("Dosen : \"Selamat ya !!\"");
                break;
            case 'B':
                System.out.println("Mhs   : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"Kenapa Yaaa ????\"");
                break;
            case 'C':
                System.out.println("Mhs   : \"Ulun turun tarus Pak ai, tugas full jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab ujian\"");
                System.out.println("Mhs   : \"Hihihaha\"");
                break;
            default:
                System.out.println("Mhs   : \"Ulun turun tarus Pak ai, Tugas Full jua\"");
                System.out.println("Dosen : \"Bujur jua kah?\"");
                System.out.println("Dosen : \"memeriksa berkas\"");
                System.out.println("Dosen : \"menceleng\"");
                System.out.println("Mhs   : \"Kkkkabur..\"");
                break;
        }
    }
}
