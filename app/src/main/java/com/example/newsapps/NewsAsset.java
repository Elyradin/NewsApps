package com.example.newsapps;

import java.util.ArrayList;

public class NewsAsset {
    ArrayList<Berita> berita = new ArrayList<>();

    public NewsAsset(){
        this.berita = addNews();
    }

    public  ArrayList<Berita> addNews(){
        ArrayList<Berita> listberita = new ArrayList<>();
        Berita berita1 = new Berita("Jadwal MotoGP Australia 2022: Quartararo dan Bagnaia Rebutan Pole Position di Philip Island",15, "Sport");
        Berita berita2 = new Berita("Mahfud MD: PSSI Harus Tanggung Jawab Pidana, Kelalaiannya Mengerikan",20, "Sport");
        Berita berita3 = new Berita("Profil Kim Wonho, Pebulutangkis Korea Selatan yang Bakal Lawan Rinov/Pitha",25, "Sport");
        Berita berita4 = new Berita("MyPertamina Sport Series Basketball Cup Digelar, Juara Bisa latihan Bareng Satria Muda",17, "Sport");
        Berita berita5 = new Berita("Maeva Ratna Eka Putri Amelia, Siswi SMK Kesehatan Citra Medika Pemenang Lomba Essay tentang Pemilu. Tergugah karena Banyak Generasi Muda Acuh dengan Politik",15, "Politic");
        Berita berita6 = new Berita("Irjen Teddy Minahasa Jadi Tersangka Peredaran Sabu",17, "Politic");
        Berita berita7 = new Berita("Jokowi Minta Polri Jaga Soliditas Jelang Tahun Politik",20, "Politic");
        Berita berita8 = new Berita("Menlu: G20 bukan forum perdebatan politik",25, "Politic");
        Berita berita9 = new Berita("Taylor Swift's Ex Conor Kennedy Enlists in Ukraine’s International Legion",17, "Entertainment");
        Berita berita10 = new Berita("Love Is Blind's Shayne Jansen Broken Inside After Death of His Mom Karen",20, "Entertainment");
        Berita berita11 = new Berita("Kiely Rodni’s Cause of Death Revealed",25, "Entertainment");
        Berita berita12 = new Berita("Managers lack confidence in employee performance as hybrid setups become permanent",20, "Worklife");
        Berita berita13 = new Berita("How emerging tech is solving hybrid-working headaches",25, "Worklife");

        berita1.isi = "Duel Fabio Quartararo dan Francesco Bagnaia akan memperebutkan pole position di Sirkuit Phillip Island. Keseruan dari gelaran MotoGP Australia 2022 dapat disaksikan melalui streaming via Vision Plus, race day hari Minggu (16/10/2022) pukul 10.00 WIB live Trans7. Meskipun menjadi kabar yang mengandung bawang bagi dunia motor dunia, namun begitu ini adalah waktu yang tepat bagi mereka untuk menghentikan kompetisi dunia balap motor. Namun begitu, ada yang menarik dari Suzuki Ecstar, salah satunya dari sang manager mereka.";
        berita2.isi = "TGIPF telah melaporkan temuannya ke Presiden Jokowi terkait Tragedi Kanjuruhan yang menewaskan 132 orang. Ketua TGIPF Mahfud MD mengeluarkan pernyataan keras ke PSSI. Lalu ke dalam, kesimpulan tim ini jelas bahwa PSSI harus bertanggung jawab, tanggung jawabnya ada dua. Satu, tanggung jawab hukum pidana. Karena itu kematian yang sangat mengerikan dan itu karena kelalaian sekurang-kurangnya sangat mengerikan kematian 132 orang Soal ini, Jokowi juga setuju. Proses pidana tetap terus diusut tuntas. Presiden mengatakan tindak pidananya terus diusut tapi kita tidak ikut pengaturan persepakbolaanya seperti yang diatur FIFA tapi tindak pidana Kapolri diminta mengusut lagi, Pengusutan pidana ini sangat penting dilakukan. Polri sudah didorong untuk mengusut tuntas kasus ini. Karena kalau dugaan tim ada yang harus lebih bertanggung jawab hukum. Polisi sudah direkomendasikan dan didorong Presiden untuk terus diusut, ";
        berita3.isi = "Pebulutangkis Korea Selatan, Kim Wonho bersama rekan mainnya yaitu Jeong Na Eun dijadwalkan menghadapi ganda campuran wakil Indonesia, Rinov Rivaldy/Pitha Haningtyas Mentari di babak awal YONEX French Open 2022. YONEX French Open 2022 sendiri bergulir mulai 25-30 Oktober 2022 di Stade Pierre de Coubertin, Paris, Perancis. Nama Kim Wonho sendiri populer di kalangan para penggemar bulutangkis dunia. Selain karir cemerlangnya di dunia bulutangkis, paras tampannya juga turut menjadi perhatian. Berada dalam naungan Asosiasi Badminton Korea (BKA), Kim Wonho bermain dalam dua sektor unggulan yaitu ganda putra dan ganda campuran. Melansir informasi resmi Federasi Bulutangkis Dunia (BWF) di aplikasi Badminton4u, saat ini Kim Wonho merupakan salah satu pemain andalan Korea Selatan. Kim Wonho bersama Jeong Na Eun menduduki peringkat 59 dunia di sektor ganda campuran. Kemudian di sektor ganda putra, Kim Wonho menempati peringkat 19 dunia bersama Choi Sol Gyu dan peringkat 135 dunia bersama Kang Min Hyuk. Sepanjang karirnya terjun ke bulutangkis internasional, Kim Wonho telah bermain dalam 73 turnamen dengan pencapaian 21 final dan 12 gelar juara.";
        berita4.isi = "KOMPAS.com - Turnamen basket SMA bertajuk MyPertamina Sport Series Basketball Cup akan berlangsung pada 24-28 Oktober 2022 di Gelanggang Mahasiswa Soemantri Brodjonegoro (GMSB) Kuningan, Jakarta. \n" +
                "\n" +
                "Turnamen MyPertamina Sport Series Basketball Cup ini akan diselenggarakan oleh Pertamina Patra Niaga Regional Jawa Bagian Barat. Tim yang menjadi juara turnamen MyPertamina Sport Series Basketball Cup tidak hanya akan mendapatkan hadiah uang. \n" +
                "\n" +
                "Akan tetapi, mereka juga bisa bisa berlatih bersama juara Indonesian Basketball League (IBL) 2022 Satria Muda Pertamina. Manajer SMAN 116 Ragunan Jakarta, Budiman Silaban, menyatakan sangat tertarik membawa timnya untuk berpartisipasi dalam turnamen ini.\n" +
                "\n" +
                "Salah satunya karena pemenang turnamen ini akan berkesempatan berlatih bersama juara IBL 2022 Satria Muda Pertamina\n" +
                "\n" +
                "\"Turnamen yang digelar Pertamina memiliki nilai lebih, bagi juara dapat latihan bareng Satria Muda. Ini suatu kesempatan yang jarang didapat. Akan memotivasi pemain untuk melihat individu pemain maupun sebagai sebuah tim, karena Satria Muda merupakan tim besar,\" ujar Budiman dalam keterangan tertulis yang diterima Kompas.com. ";
        berita5.isi = "SUKOHARJO-Berlatar belakang sekolah di bidang kesehatan tak menghalangi Maeva Ratna Eka Putri Amelia, siswi SMK Kesehatan Cita Medika Sukoharjo berprestasi di bidang lainnya. Dia moncer pada lomba penulisan essay dengan topik pemilu.\n" +
                "\n" +
                "Essay berjudul Menumbuhkan Kesadaran Politik bagi Pemilih Pemula melalui Pengawasan Partisipatif pada Pemilu 2024 mengantarkan Mahesa meraih juara kedua.\n" +
                "\n" +
                "Berangkat dari keresahan Mahesa pada generasi muda yang dinilainya kurang tertarik dengan bidang politik. Di antaranya pasif dalam pemilu. Maeva kemudian melakukan riset sederhana dengan mengamati angka golput pada Pemilu 2019. Dimana golput didominasi generasi muda. Mungkin karena mereka apatis sama politik, yang disebabkan miskonsepsi tentang informasi di media sosial. Itu membuat mereka acuh. Tidak peduli lagi sama politik, Dalam pembuatan essay tersebut, Maeva menemui sejumlah tantangan. Mengingat dia belum pernah ikut pemilu karena umurnya belum memenuhi syarat. Beruntung, Maeva didampingi, Raisa, salah seorang gurunya. Berbekal pendampingan guru dan banyak membaca literatur tentang pemilu. Ditambah penguasaan materi pelajaran Bahasa Indonesia, Pendidikan Kewarganegaraan (PKn), Maeva percaya diri mempresentasikan karya tulis dan argumennya di hadapan juri. Hasilnya memuaskan.";
        berita6.isi = "Polisi resmi menetapkan Kapolda Sumatera Barat Inspektur Jenderal Pol. Teddy Minahasa sebagai tersangka kasus narkoba. Teddy ditetapkan sebagai tersangka usai diduga terlibat dalam peredaran sabu.\n" +
                "\n" +
                "Penetapan dilakukan usai gelar perkara pada hari ini. \"Sudah ditetapkan Bapak TM menjadi tersangka,\" kata Direktur Reserse Narkoba Polda Metro Jaya, Komisaris Besar Polisi Mukti Juharsa saat konferensi pers di Jakarta, Jumat (14/10) dikutip dari Antara.\n" +
                "\n" + "Sebelumnya, Kapolri Jenderal Pol. Listyo Sigit Prabowo mengatakan, keterlibatan Teddy terbongkar dari penyidikan jaringan narkoba yang dilakukan Polda Metro Jaya. Awalnya, kepolisian menangkap tiga warga sipil pada Senin (10/10). Dari keterangan yang didapatkan, ternyata ada keterlibatan polisi berpangkat Bripka dan Kompol dengan jabatan Kapolsek. Kapolri pun memerintahkan penyidik untuk terus mengembangkan kasus ini, sehingga terungkap sosok pengedar di jaringan tersebut. \"Kemudian mengarah kepada personil oknum anggota Polri berpangkat AKBP, mantan Kapolres Bukittinggi, Dari pengembangan di Bukittinggi ini selanjutnya ditemukan indikasi keterlibatan Teddy dengan jaringan yang tertangkap di Jakarta. Selanjutnya, Kapolri meminta Kepala Divisi Profesi dan Pengamanan, Inspektur Jenderal Syahardiantono, untuk menjemput serta memeriksa Teddy.";
        berita7.isi = "JAKARTA - Presiden Joko Widodo (Jokowi) meminta Polri untuk memperkuat soliditas hingga menjaga soliditas bersama TNI menjelang tahun politik yang akan berlangsung pada 2024 mendatang.\n" +
                "\n" +
                "Kepala Negara juga meminta Korps Bhayangkara untuk mengawal program pemerintah, bantuan pemerintah untuk negara lain, hingga mengawal stabilitas harga-harga guna menekan angka inflasi akibat ketidakpastian situasi global.\n" +
                "\"Soliditas untuk mengawal dan menjalan tugas pokok dan fungsi Polri dalam menjaga keamanan apalagi memasuki tahun politik dengan mengambil langkah-langkah tegas yang berdampak pada perpecahan dan polarisasi di masyarakat,\" kata Kapolri Jenderal Pol Listyo Sigit Prabowo di Istana Kepresidenan, Jakarta, Jumat (14/10/2022).\n" +
                "\n" +
                "Jokowi sebelumnya menerima Kapolri, dan pejabat Polri mulai dari Kapolri, pejabat utama, kapolda, hingga Kapolres se-Indonesia di Istana.";
        berita8.isi = "Jakarta (ANTARA) - Menteri Luar Negeri RI Retno LP Marsudi menegaskan bahwa forum 20 ekonomi terbesar dunia (Group of Twenty/G20) bukan merupakan wadah perdebatan politik, melainkan untuk berbagai upaya bersama terkait ekonomi dan pembangunan.\n" +
                "\n" +
                "“Memang G20 sebenarnya bukan untuk forum perdebatan politik, ini adalah forum keuangan, forum ekonomi, forum pembangunan,” kata Menlu dalam wawancara khusus dengan ANTARA di Kementerian Luar Negeri RI di Jakarta, Kamis.\n" +
                "\n" +
                "Menjelang konferensi tingkat tinggi (KTT) G20 yang akan digelar di Pulau Bali pada November mendatang, Menlu mengatakan bahwa menimbang situasi dunia saat ini, khususnya peperangan di Ukraina, mungkin pembicaraan terkait keadaan geopolitik nantinya tak akan dapat dihindari.\n" +
                "\n" +
                "Pasalnya, peperangan di Ukraina telah berdampak pada pasokan pangan dan energi global, sehingga pembicaraan terkait hal tersebut dipastikan Menlu akan menjadi bagian dari KTT G20 nanti.";
        berita9.isi = "Taylor Swift's ex, Conor Kennedy, helped the people of Ukraine from the frontlines.\n" +
                "\n" +
                "The 28-year-old—whose parents are Robert Kennedy Jr. and the late Mary Richardson Kennedy—revealed on social media that earlier this year he enlisted in Ukraine's International Legion after Russian military forces invaded the Eastern European country in February.\n" +
                "\n" +
                "\"I know this story is coming out, so I want to say my piece first to make the best of it and encourage others to take action,\" he wrote in an Oct. 14 Instagram post, alongside a picture of his friend on the frontlines in Ukraine. \"Like many people, I was deeply moved by what I saw happening in Ukraine over the past year. I wanted to help. When I heard about Ukraine's International Legion, I knew I was going, and I went to the embassy to enlist the next day.\"\n" +
                "\n" +
                "Conor said that he only told one person in the U.S. about his enlistment and only gave one person in Ukraine his real name. He shared that he didn't want those close to him to worry and he \"didn't want to be treated differently there\" due to his famous family.";
        berita10.isi = "The pod squad is rallying around Love Is Blind's Shayne Jansen following the death of his mom Karen.\n" +
                "\n" +
                "The season two contestant announced his mother's passing on Instagram Oct. 13. \"I lost my best friend today,\" Shayne wrote. \"For the last year we have been inseparable. Coffee every morning to Schitt's Creek every night. I'm broken inside but I know I can live with zero regrets knowing we did everything together. I'll never be able to replace my FaceTime partner on the daily. Thank you all for the support.\"\n" +
                "\n" +
                "Along with his message, the realtor from Wisconsin shared a series of throwback photos of him and his mom, which showed them hanging out, FaceTiming and texting about Shania Twain songs. \n" +
                "\n" +
                "Following Shayne's announcement, members of the Love Is Blind family sent their condolences, including hosts Vanessa and Nick Lachey. The actress wrote in the comments, \"Sending you Love. I'm so sorry,\" while the 98 Degrees star added, \"So sorry brother….\"";
        berita11.isi = "More details are coming to light in the case of teenager Kiely Rodni.\n" +
                "\n" +
                "The 16-year-old went missing on the night of Aug. 16 on her way home from a high school graduation party near Truckee, Calif. A car was found submerged in the Prosser Creek Reservoir and the body inside it was positively identified to be the missing teen on Aug. 21, police said in a press conference, as E! News previously reported.\n" +
                "\n" +
                "Now, the Nevada County, Calif. coroner's office has released the young girl's cause of death.\n" +
                "\n" +
                "In the official documents obtained by E! News on Oct. 13, the coroner's office revealed that she \"drowned in lake while in her vehicle.\" Her manner of death was ruled accidental.\n" +
                "\n" +
                "Kiely was last heard from around 12:30am on the day she went missing when she texted her mother, Lindsey Rodni-Nieman, to let her know she was on her way home, according to authorities. When she failed to arrive, the authorities were contacted and a search began to locate her. \n" +
                "\n" +
                "It took more than two weeks to find Kiely.";
        berita12.isi = "Hybrid work arrangements may be the status quo, but many business leaders worry they’ve created a drag on productivity. \n" +
                "\n" +
                "In a recent poll of 20,000 people in 11 countries, Microsoft found that 85% of managers believe hybrid work has made it challenging to feel confident that their employees are as productive as ever. Some have chalked up a perceived decline in productivity to something that’s been dubbed “Corporate Long Covid,” referring to the strain that’s been put on employers and employees more than two and a half years into the pandemic. Meanwhile, employees continue to insist that they are just as productive working under hybrid and remote arrangements as they are in an office.\n" +
                "\n" +
                "Microsoft CEO Satya Nadella told the BBC this tension needed to be resolved as workplaces are likely to remain hybrid. “We have to get past what we describe as ‘productivity paranoia,’ because all of the data we have shows that 80% plus of the individual people feel they’re very productive — except their management thinks that they’re not productive,” he said. “That means there is a real disconnect in terms of the expectations and what they feel.”";
        berita13.isi = "It’s difficult to know — without a set routine — when remote employees will be in the office, which has created disappointment at making it into the office only to find no one else there. To that end, Condeco, a workplace scheduling software firm, created an app to integrate with Microsoft Teams. The integration enables employees to choose, set, and share their in-office schedule for the week with their teams directly in their Microsoft Teams chat or channel. To avoid miscommunication about when everyone will next be in the office, those attending a virtual meeting can be automatically assigned to an in-office day collectively, making it easier for a group to work together on a project in-person, and reduce any potential coordination snafus. They can also find and book a meeting space with a group of colleagues from within their existing Teams chat or channel via the Condeco app.\n" +
                "\n" +
                "Before downloading the app, customers must have the Condeco Microsoft 365 integration, a Microsoft Teams subscription and an active Condeco account. For activation, your administrator must give permission to the Condeco app from the Microsoft Teams Admin Center to ensure users get the full experience.";

        listberita.add(berita1);
        listberita.add(berita2);
        listberita.add(berita3);
        listberita.add(berita4);
        listberita.add(berita5);
        listberita.add(berita6);
        listberita.add(berita7);
        listberita.add(berita8);
        listberita.add(berita9);
        listberita.add(berita10);
        listberita.add(berita11);
        listberita.add(berita12);
        listberita.add(berita13);

        return  listberita;
    }
}
