package com.example.quizapp

object Constants{

    const val USERNAME : String = "username"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val correctAnswers: String = "correct_answers"
    const val ACTIVITY_ID: String = "activity_id"

    fun getQuestions(): ArrayList<questions> {

        val questionlist = ArrayList<questions>()

        val q1 =  questions(
            1,
            "Which country does this flag belong to ? ",
            R.drawable.ar,
            "Argentina",
            "France",
            "Armenia",
            "Austuria",
            1
        )
        questionlist.add(q1)


        val q2 =  questions(
            2,
            "Which country does this flag belong to ? ",
            R.drawable.az,
            "Turkey",
            "Azerbaijan",
            "Turkmenistan",
            "Albania",
            2
        )
        questionlist.add(q2)


        val q3 =  questions(
            3,
            "Which country does this flag belong to ? ",
            R.drawable.ca,
            "Argentina",
            "France",
            "Armenia",
            "Canada",
            4
        )
        questionlist.add(q3)



        val q4 =  questions(
            4,
            "Which country does this flag belong to ? ",
            R.drawable.be,
            "Us",
            "Italy",
            "Belgium",
            "Belarus",
            3
        )

        questionlist.add(q4)




        val q5 =  questions(
            5,
            "Which country does this flag belong to ? ",
            R.drawable.br,
            "Argentina",
            "France",
            "Brasil",
            "Austuria",
            3
        )

        questionlist.add(q5)





        val q6 =  questions(
            6,
            "Which country does this flag belong to ? ",
            R.drawable.jp,
            "South Korea",
            "Japan",
            "Thailand",
            "Austuria",
            2
        )

        questionlist.add(q6)





        val q7 =  questions(
            7,
            "Which country does this flag belong to ? ",
            R.drawable.eg,
            "Yemen",
            "Sudan",
            "Iraq",
            "Egypt",
            4
        )

        questionlist.add(q7)





        val q8 =  questions(
            8,
            "Which country does this flag belong to ? ",
            R.drawable.de,
            "Us",
            "Italy",
            "Belgium",
            "Deutschland",
            4
        )

        questionlist.add(q8)





        val q9 =  questions(
            9,
            "Which country does this flag belong to ? ",
            R.drawable.ua,
            "Canada",
            "Ukrain",
            "Belarus",
            "Russia",
            2
        )

        questionlist.add(q9)





        val q10 =  questions(
            10,
            "Which country does this flag belong to ? ",
            R.drawable.tr,
            "Azerbeijan",
            "Turkmenistan",
            "Turkey",
            "Iraninan",
            3
        )

        questionlist.add(q10)





        val q11 =  questions(
            11,
            "Which country does this flag belong to ? ",
            R.drawable.us,
            "United States",
            "Great Britain",
            "Armenia",
            "Belgium",
            1
        )
        questionlist.add(q11)





        val q12 =  questions(
            12,
            "Which country does this flag belong to ? ",
            R.drawable.kr,
            "Japan",
            "Thailand",
            "Armenia",
            "Korea",
            4
        )
        questionlist.add(q12)



        val q13 =  questions(
            13,
            "Which country does this flag belong to ? ",
            R.drawable.it,
            "Mexican",
            "Espania",
            "Italy",
            "Iranian",
            3
        )
        questionlist.add(q13)




        val q14 =  questions(
            14,
            "Which country does this flag belong to ? ",
            R.drawable.fr,
            "Paraguay",
            "France",
            "Italia",
            "Ireland",
            2
        )
        questionlist.add(q14)






        val q15 =  questions(
            15,
            "Which country does this flag belong to ? ",
            R.drawable.es,
            "Etopya",
            "Italy",
            "Espania",
            "Mali",
            3
        )
        questionlist.add(q15)







        return questionlist

    }

















                    //  TEAM LOGOS CATEGORY



















    fun TeamFlagQuestions(): ArrayList<questions> {

        val Teamquestionlist = ArrayList<questions>()

        val q1 =  questions(
            1,
            "Which football team does this logo belong to ? ",
            R.drawable.leedsunited,
            "Napoli SSC",
            "Benfica SL",
            "Leeds United",
            "FC Famalicão",
            3
        )
        Teamquestionlist.add(q1)


        val q2 =  questions(
            2,
            "Which football team does this logo belong to ? ",
            R.drawable.zenit,
            "Dinamo Zagreb",
            "Zenit",
            "CSKA Moscow ",
            "Panathinaikos",
            2
        )
        Teamquestionlist.add(q2)



        val q3 =  questions(
            3,
            "Which football team does this logo belong to ? ",
            R.drawable.shakhtardonetsk,
            "Maccabi Tel Aviv ",
            "Dinamo Zagreb",
            "Basel",
            "Shakhtar Donetsk",
            4
        )
        Teamquestionlist.add(q3)



        val q4 =  questions(
            4,
            "Which football team does this logo belong to ? ",
            R.drawable.sampdoria,
            "Cagliari ",
            "Bologna",
            "UC Sampdoria",
            "Genoa",
            3
        )

        Teamquestionlist.add(q4)




        val q5 =  questions(
            5,
            "Which football team does this logo belong to ? ",
            R.drawable.realsociedad,
            "Celta Vigo",
            "Real Betis ",
            "Real Sociedad",
            "Real Mallorca",
            3
        )

        Teamquestionlist.add(q5)





        val q6 =  questions(
            6,
            "Which football team does this logo belong to ? ",
            R.drawable.realbetis,
            "Real Zaragoza",
            "Real Sociedad",
            "Real Mallorca",
            "Real Betis",
            4
        )

        Teamquestionlist.add(q6)





        val q7 =  questions(
            7,
            "Which football team does this logo belong to ? ",
            R.drawable.porto,
            "FC Sporting",
            "Porto",
            "Boca Juniors",
            "Benfica",
            2
        )

        Teamquestionlist.add(q7)





        val q8 =  questions(
            8,
            "Which football team does this logo belong to ? ",
            R.drawable.panathinaikos,
            "Boca Juniors",
            "Olympiacos",
            "Panathinaikos FC",
            "Celtic",
            3
        )

        Teamquestionlist.add(q8)





        val q9 =  questions(
            9,
            "Which football team does this logo belong to ? ",
            R.drawable.leedsunited,
            "Leeds City FC",
            "Leeds United AFC",
            "Aston Villa",
            "Crystal Palace",
            2
        )

        Teamquestionlist.add(q9)





        val q10 =  questions(
            10,
            "Which football team does this logo belong to ? ",
            R.drawable.fiorentina,
            "ACF Fiorentina",
            "Bologna",
            "Torino",
            "Udinese",
            1
        )

        Teamquestionlist.add(q10)





        val q11 =  questions(
            11,
            "Which football team does this logo belong to ? ",
            R.drawable.dynamozagreb,
            "Swansea City",
            "Hajduk Split",
            "Boca Juniors",
            "GNK Dinamo Zagreb",
            4
        )
        Teamquestionlist.add(q11)





        val q12 =  questions(
            12,
            "Which football team does this logo belong to ? ",
            R.drawable.cskamoscow,
            "Spartak Moscow",
            "Rubin Kazan",
            "CSKA Moscow",
            "Krasnodar",
            3
        )
        Teamquestionlist.add(q12)



        val q13 =  questions(
            13,
            "Which football team does this logo belong to ? ",
            R.drawable.braga,
            "Benfica",
            "Aston Villa",
            "Braga",
            "Bologna",
            3
        )
        Teamquestionlist.add(q13)







        val q14 =  questions(
            14,
            "Which football team does this logo belong to ? ",
            R.drawable.basel,
            "Aston Villa",
            "Real Mallorca",
            "FC Basel",
            "RSC Anderlecht",
            3
        )
        Teamquestionlist.add(q14)





        val q15 =  questions(
            15,
            "Which football team does this logo belong to ? ",
            R.drawable.anderlecht,
            "Real Zaragoza",
            "Genk",
            "Levante",
            "Anderlecht",
            4
        )
        Teamquestionlist.add(q15)




        return   Teamquestionlist

    }






    // Company Category





    fun CompanyQuestions(): ArrayList<questions> {

        val CompanyQuestionlist = ArrayList<questions>()

        val q1 =  questions(
            1,
            "Which company does this logo belong to ? ",
            R.drawable.atari,
            "Formula 1",
            "Activision",
            "Atari",
            "PlayStation",
            3
        )
        CompanyQuestionlist.add(q1)

        val q2 =  questions(
            2,
            "Which company does this logo belong to ? ",
            R.drawable.wendys,
            "Wenco",
            "Arby's",
            "Wendy's",
            "Weebly",
            3
        )
        CompanyQuestionlist.add(q2)




        val q3 =  questions(
            3,
            "Which company does this logo belong to ? ",
            R.drawable.becks,
            "Corona",
            "Becks",
            "Bud",
            "Heineken",
            2
        )
        CompanyQuestionlist.add(q3)



        val q4 =  questions(
            4,
            "Which company does this logo belong to ? ",
            R.drawable.carlsjr,
            "Popeyes",
            "Arby's",
            "Sbarro",
            "Carl's Jr.",
            4
        )

        CompanyQuestionlist.add(q4)




        val q5 =  questions(
            5,
            "Which company does this logo belong to ? ",
            R.drawable.gucci,
            "Calvin Klein",
            "Gucci ",
            "Guess",
            "General Electric",
            2
        )

        CompanyQuestionlist.add(q5)






        val q6 =  questions(
            6,
            "Which company does this logo belong to ? ",
            R.drawable.yamaha,
            "Yamaha",
            "Kawasaki",
            "Ducati",
            "KTM",
            1
        )
        CompanyQuestionlist.add(q6)






        val q7 =  questions(
            7,
            "Which company does this logo belong to ? ",
            R.drawable.kfc,
            "Pringles",
            "KFC",
            "Arby's",
            "Heinz",
            2
        )

        CompanyQuestionlist.add(q7)





        val q8 =  questions(
            8,
            "Which company does this logo belong to ? ",
            R.drawable.kodak,
            "Canon Inc",
            "Polaroid",
            "Kodak",
            "Nikon",
            3
        )

        CompanyQuestionlist.add(q8)





        val q9 =  questions(
            9,
            "Which company does this logo belong to ? ",
            R.drawable.masttercard,
            "Master Card",
            "Visa",
            "Paypal",
            "Papara",
            1
        )

        CompanyQuestionlist.add(q9)





        val q10 =  questions(
            10,
            "Which company does this logo belong to ? ",
            R.drawable.michelin,
            "Michelin",
            "Petlas",
            "Pirelli",
            "Continental",
            1
        )

        CompanyQuestionlist.add(q10)





        val q11 =  questions(
            11,
            "Which company does this logo belong to ? ",
            R.drawable.microsoft,
            "Windows",
            "Intel",
            "Nvidia",
            "Microsoft",
            4
        )
        CompanyQuestionlist.add(q11)





        val q12 =  questions(
            12,
            "Which company does this logo belong to ? ",
            R.drawable.monster,
            "Burn",
            "Rockstar Energy",
            "Monster",
            "Bang",
            3
        )
        CompanyQuestionlist.add(q12)



        val q13 =  questions(
            13,
            "Which company does this logo belong to ? ",
            R.drawable.motorla,
            "Mitsubishi",
            "Motorola",
            "Macy's",
            "Mars",
            2
        )
        CompanyQuestionlist.add(q13)







        val q14 =  questions(
            14,
            "Which company does this logo belong to ? ",
            R.drawable.nestle,
            "Dove",
            "Delta Air Lines",
            "Novartis",
            "Nestle",
            4
        )
        CompanyQuestionlist.add(q14)





        val q15 =  questions(
            15,
            "Which company does this logo belong to ? ",
            R.drawable.pringles,
            "Pringles",
            "KFC",
            "PepsiCo",
            "Arby's",
            1
        )
        CompanyQuestionlist.add(q15)



        val q16 =  questions(
            16,
            "Which company does this logo belong to ? ",
            R.drawable.redbull,
            "Red Rain",
            "RedBull",
            "Taurus",
            "Chicago Bulls",
            2
        )
        CompanyQuestionlist.add(q16)




        val q17 =  questions(
            17,
            "Which company does this logo belong to ? ",
            R.drawable.rolex,
            "Ray-Ban",
            "Reebok ",
            "Rolex",
            "Rolls-Royce",
            3
        )
        CompanyQuestionlist.add(q17)





        val q18 =  questions(
            18,
            "Which company does this logo belong to ? ",
            R.drawable.spoti,
            "Sporcle",
            "SpotMe",
            "Sporcle",
            "Spotify",
            4
        )
        CompanyQuestionlist.add(q18)





        val q19 =  questions(
            19,
            "Which company does this logo belong to ? ",
            R.drawable.strabcks,
            "Salesforce",
            "Subway",
            "Sony ",
            "Starbucks",
            4
        )
        CompanyQuestionlist.add(q19)



        val q20 =  questions(
            20,
            "Which company does this logo belong to ? ",
            R.drawable.tesla    ,
            "Toyota",
            "Tesla",
            "Tesoro ",
            "Tata Motors",
            2
        )
        CompanyQuestionlist.add(q20)





        return   CompanyQuestionlist

    }









    fun tfQuestions(): ArrayList<questions> {

        val trueFalseQuestionlist = ArrayList<questions>()

        val q1 =  questions(
            1,
            "Hangi gezegen Güneş Sistemi'nde altıncı sıradadır? ",
            R.drawable.gezgen,
            "Mars",
            "Jüpiter",
            "Venüs",
            "Dünya",
            2
        )
        trueFalseQuestionlist.add(q1)

        val q2 =  questions(
            2,
            "Mona Lisa tablosu kimin tarafından yapılmıştır? ",
            R.drawable.monalisa,
            "Michelangelo",
            "Vincent van Gogh",
            "Leonardo da Vinci",
            "Pablo Picasso",
            3
        )
        trueFalseQuestionlist.add(q2)

        val q3 =  questions(
            3,
            "Çin'in başkenti nedir? ",
            R.drawable.baskent,
            "Şanghay",
            "Pekin",
            "Tokyo",
            "Seul",
            2
        )
        trueFalseQuestionlist.add(q3)


        val q4 =  questions(
            4,
            "Birinci Dünya Savaşı hangi yıllar arasında gerçekleşti? ",
            R.drawable.worldwar,
            "1914-1918",
            "1939-1945",
            "1870-1871",
            "1898-1902",
            1

        )
        trueFalseQuestionlist.add(q4)





        val q5 =  questions(
            5,
            "Romeo ve Juliet eseri hangi yazarın eseridir?",
            R.drawable.romeojuliet,
            "Charles Dickens",
            "William Shakespeare",
            "Jane Austen",
            "Mark Twain",
            2
        )
        trueFalseQuestionlist.add(q5)




        val q6 =  questions(
            6,
            "İnsan vücudu kaç kemikten oluşur? ",
            R.drawable.iskelet,
            "178",
            "206",
            "210",
            "218",
            2
        )
        trueFalseQuestionlist.add(q6)




        val q7 =  questions(
            7,
            "Hangi gezegen Akşam Yıldızı olarak da bilinir?",
            R.drawable.gezgen,
            "Mars",
            "Venüs",
            "Jüpiter",
            "Uranüs",
            2
        )
        trueFalseQuestionlist.add(q7)




        val q8 =  questions(
            8,
            "Dünya'nın en yüksek dağı olan Everest Dağı, hangi dağ sırasında yer alır? ",
            R.drawable.everest,
            "Rocky Dağları",
            "And Dağları",
            "Himalaya Dağları",
            "Ural Dağları",
            3
        )
        trueFalseQuestionlist.add(q8)






        val q9 =  questions(
            9,
            "Hangi gezegenin uydusu olan Titan, Güneş Sistemi'ndeki en büyük ikinci uydudur? ",
            R.drawable.uydu,
            "Mars",
            "Jüpiter",
            "Venüs",
            "Saturn",
            4
        )
        trueFalseQuestionlist.add(q9)









        val q10 =  questions(
            10,
            "İlk cep telefonu hangi yıl icat edildi?",
            R.drawable.ceptel,
            "1969",
            "1973",
            "1982",
            "1990",
            2
        )
        trueFalseQuestionlist.add(q10)










        val q11 =  questions(
            11,
            "Hangi ülke, güneşin doğduğu ülke olarak anılır?",
            R.drawable.gundog,
            "Japonya",
            "Türkiye",
            "İspanya",
            "Meksika",
            1
        )
        trueFalseQuestionlist.add(q11)







        val q12 =  questions(
            12,
            "Hangi ünlü ressam Gece Yıldızı adlı tablosuyla ünlüdür? ",
            R.drawable.nightstar,
            "Vincent van Gogh",
            "Pablo Picasso",
            "Leonardo da Vinci",
            "Salvador Dalí",
            1
        )
        trueFalseQuestionlist.add(q12)





        val q13 =  questions(
            13,
            "Big Bang Teorisi ne göre evrenin başlangıcı ne zaman gerçekleşti?",
            R.drawable.gbanggg,
            "4.5 milyar yıl önce",
            "13.8 milyar yıl önce",
            "1 milyar yıl önce",
            "100 milyon yıl önce",
            2
        )
        trueFalseQuestionlist.add(q13)






        val q14 =  questions(
            14,
            "Hangi kimyacı, periyodik tabloyu geliştiren isim olarak bilinir?",
            R.drawable.periodic,
            "Marie Curie",
            "Albert Einstein",
            "Dmitri Mendeleev",
            "Isaac Newton",
            3
        )
        trueFalseQuestionlist.add(q14)





        val q15 =  questions(
            15,
            "Hangi ülkenin bayrağında dört büyük beyaz yıldız bulunur?",
            R.drawable.bayraklar,
            "Brezilya",
            "Yeni Zelanda",
            "Avustralya",
            "Kanada",
            2
        )
        trueFalseQuestionlist.add(q15)





        return   trueFalseQuestionlist

    }








    }