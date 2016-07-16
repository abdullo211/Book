package com.application.book;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.OutputStreamWriter;


public class PreLoadActivity extends Activity {

    JSONArray mainArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_preload);

        mainArray=new JSONArray();
        JSONObject firstBook=new JSONObject();
        JSONArray contents=new JSONArray();
        JSONObject content1=new JSONObject();

        try {
            firstBook.put("name","Alkimyogar");
            firstBook.put("author","Paulo Coelho");
            firstBook.put("id",2);

            content1.put("title","MUQADDIMA");
            content1.put("text","Alkimyogar kitobni qo'liga oldi, uni sayyohlardan kimdir olib kelgan edi. Kitob muqovasiz edi, biroq u muallifning ism-sharifini topdi — Oskar Uayld — va uni varaqlab, tuyqusdan nigohi Nargis haqidagi rivoyatga tushdi.\n" +
                    "\n" +
                    "Kun-uzzun anhor bo'yida o'z aksiga mahliyo bo'lib o'tiradigan sohibjamol bo'zbola haqidagi rivoyat Alkimyogarga ma'lum edi: Nargis shu qadar mahliyo bo'lib anhorga termilib qolgan ediki, oxir-oqibat suvga qulab, cho'kib ketdi, qirg'oqdan esa gul unib chiqdi, gulni uning nomi bilan atashdi.\n" +
                    "\n" +
                    "Biroq Oskar Uayld bu rivoyatni boshqacha hikoya qilgan.\n" +
                    "\n" +
                    "\"Nargis halok bo'lgach, o'rmon nimfalari — driadalar sezdilarki, anhorning chuchuk suvi ko'z yoshdan sho'rlanibdi.\n" +
                    "\n" +
                    "— Sen nega yig'layapsan? — so'rashdi driadalar.\n" +
                    "\n" +
                    "— Men Nargisga aza tutayapman, — javob qildi anhor.\n" +
                    "\n" +
                    "— Buning ajablanadigan joyi yo'q, — deyishdi driadalar. — Oqibat shu ekan, axir, u o'rmondan o'tganda biz doimo ortidan yugurar edik, yolg'iz sensan — uning husnu jamolini yaqindan ko'rgan.\n" +
                    "\n" +
                    "— U sohibjamolmidi? — so'radi shunda anhor.\n" +
                    "\n" +
                    "— Ha, bu haqda sendan o'zga kim ham bir so'z ayta olardi? — ajablanishdi o'rmon nimfalari: — Sening qirg'og'ingda o'tirib, sening suvlaringga termilib, azondan shom qorong'usigacha vaqt o'tkazgan emasmidi u?\n" +
                    "\n" +
                    "Anhor uzoq sukut saqladi va nihoyat javob qildi:\n" +
                    "\n" +
                    "— Men Nargisga aza tutayapman, biroq hech qachon uning go'zal ekanini payqamabman. Ko'z yoshlarimni oqizayotganim boisi, har safar u qirg'og'imga kelib, egilib suvlarimga termilib o'tirganida, ko'zlarining tubida mening go'zalligim yuz ko'rsatardi\".\n" +
                    "\n" +
                    "\"Naqadar g'aroyib rivoyat\", — o'yladi Alkimyogar.");
            JSONObject content2=new JSONObject();
            content2.put("title","BIRINCHI QISM");
            content2.put("text","Bo'zbolaning ismi Santyago. U qo'ylarini tashlandiq holga kelgan yarim vayrona cherkovga haydab kirayotganda qosh qoraya boshlagandi. Cherkov gumbazi allaqachonlar o'pirilgan va xaroba holga kelgan, bir paytlar mehrob bo'lgan joydan kattakon tutanjir o'sib chiqqan.\n" +
                    "\n" +
                    "Shu yerda tunashga qaror qildi Santyago, chirib sinib yotgan eshikdan qo'ylarini ichkariga haydab kiritdi-da, bo'lak-so'lak taxtalar bilan suruv chiqib ketolmaydigan qilib eshikni tambaladi. Okrugda bo'rilar yo'q edi, biroq ba'zan qo'ylar uloqib ketib qolar, biror-bir daydi qo'yni qidirib kun-uzzun ovora bo'lishga to'g'ri kelardi.\n" +
                    "\n" +
                    "Santyago kamzulini yerga to'shadi, boshi tagiga yaqinda o'qib tugatgan kitobni qo'ydi va cho'zildi. Uyquga ketishdan oldin: qalinroq kitob olib chiqqanim tuzuk ekan — ancha vaqt o'qirdim, yostiq uchun ham qulay bo'lardi, deb o'yladi. U uyg'onganda hali qorong'u, tepasida tun choyshabining yirtiqlaridan yulduzlar charaqlab turardi.\n" +
                    "\n" +
                    "\"Yana ozgina uxlasam\", o'yladi Santyago.\n" +
                    "\n" +
                    "Uyqusida yana o'sha — o'tgan hafta ko'rgan tushi jonlandi va tushni tag'in oxirigacha ko'rishga ulgurmadi.\n" +
                    "\n" +
                    "U boshini ko'tardi, vinodan bir qultum ichdi. Tayog'ini qo'liga oldi va mudrab yotgan qo'ylarni turtkilay boshladi. Biroq suruvning katta bir to'dasi u ko'zini ochgan damdayoq qo'zg'algan, go'yo u bilan qo'ylar orasida allaqanday sirli aloqa borday, u suruv bilan, mana, ikki yildan beri suv va ozuqa qidirib, bir joydan boshqa joyga sang'iydi. \"Menga shu qadar o'rganib qolishdiki, hamma odatimni o'zlashtirib oldi bular, — ming'illadi u. — Mening hatto kundalik rejamdan ham boxabar\".\n" +
                    "\n" +
                    "U yana shu haqda biroz mulohaza qilib, ehtimol, buning aksidir — men ularning odatlarini o'zlashtirib, suruvning tartibiga tushib olgandirman, degan xulosaga keldi.\n" +
                    "\n" +
                    "Biroq boshqa bir to'da qo'y Santyagoning tayoq uchi bilan birma-bir nomini aytib turtkilaganiga qaramay, qo'zg'alishga shoshilmasdi. Umuman, uning ishonchi komil edi — qo'ylar Santyago aytgan gaplarni yaxshi tushunardi, shuning uchun ba'zan u kitobchalarning o'ziga yoqqan joylarini qo'ylarga eshittirib o'qir yoki suruvni haydab o'tgan shaharlar, qishloqlarda eshitgan yangiliklarni ularga gapirib berardi.\n" +
                    "\n" +
                    "Darvoqe, keyingi paytlarda bo'zbola faqat bir narsa — yana to'rt kundan keyin o'zi yetib keladigan shaharda yashaydigan savdogarning qizi haqida gapirardi. U qizni faqat bir marta — o'tgan yili ko'rgan. Movut va jun bilan oldi-sotdi qiladigan do'kondor qo'ylarning junini ko'z oldida qirqtirishni xohlaydi — shunday qilinsa uni aldasholmaydi. Oshnalaridan kimdir Santyagoga shu do'konni ko'rsatdi va u qo'ylarini o'sha tarafga haydadi.\n" +
                    "\n" +
                    "\"Jun sotmoqchiman\", dedi u do'kondorga.\n" +
                    "\n" +
                    "Do'kon peshtaxtasi oldida odamlar uymalashib turardi, xo'jayin cho'pondan tushlikkacha kutib turishini so'radi. Santyago rozi bo'ldi va yo'lakka o'tirib, to'rvasidan kitobchasini oldi.\n" +
                    "\n" +
                    "— Voy, cho'ponlar ham kitob o'qisharkan-da, bilmas ekanman, — yonginasidan qiz bolaning qo'ng'iroqday tovushi jarangladi.\n" +
                    "\n" +
                    "U boshini ko'tarib, ko'rinishidan haqiqiy andaluslik, sochlari taqimiga tushgan, qop-qora va mayin ko'zlari esa xuddi bir vaqtlar Ispaniyani zabt etgan mavrlarnikiday qizni ko'rdi.\n" +
                    "\n" +
                    "— Cho'ponlar kitob o'qishi shart emas: qo'ylar har qanday kitobdan ham ko'proq narsaga o'rgatadi, — javob qildi unga Santyago.\n" +
                    "\n" +
                    "Shu zayl gap gapga ulashib, ular gurunglashib ketishdi va rosa ikki soat miriqib suhbatlashdi. Qizaloq do'kondorga qiz bo'lishini, hayoti zerikarli, kunlari xuddi ikki tomchi suvday bir xilligini aytdi. Santyago esa unga Andalusiya yaylovlari haqida, yo'lining ustidagi katta shaharlar haqida eshitganlarini gapirib berdi. Qiz bilan suhbat qurganidan uning kayfi chog' bo'ldi — axir, bu qo'ylarga gapirgandan yaxshi-da.\n" +
                    "\n" +
                    "— Sen o'qishni qaerda o'rgangansan, — so'radi qiz.\n" +
                    "\n" +
                    "— Hamma qaerda o'rgansa, o'sha yerda-da, — javob qildi bo'zbola. — Maktabda.\n" +
                    "\n" +
                    "— Nega endi savoding bo'lsayam qo'y boqib yuribsan?\n" +
                    "\n" +
                    "Javob o'rniga Santyago boshqa narsa haqida gapirdi: qiz uni baribir tushunmasligiga ishonchi komil edi. U qizga o'zining jahongashtaligidan gapirdi, qizning mavrlarnikiga o'xshagan ko'zlari goh moshday ochilsa, goh hayratdan qisilib ketardi. Vaqt bilinmay o'tar, Santyago ichida bu kunning tugamasligini, savdogarning do'koniga odam yog'ilishini va qo'ylarni qirqtirish bahonasida uch-to'rt kun shu yerda qolib ketishini xohlardi. Hech qachon hozirgiday holatni tuymagan edi; uning shu yerda umrbod qolgisi keldi. Bu qorasoch qiz bilan kunlari sira ham ikki tomchi suvday bir xil kechmasligi aniq edi.\n" +
                    "\n" +
                    "Biroq shu payt qizning otasi do'kondan chiqib keldi va suruvni oralab, qirqish uchun to'rtta qo'yni ajratib oldi. Keyin kelishilganiday haq to'ladi va dedi:\n" +
                    "\n" +
                    "— Endi bir yildan keyin kel.\n" +
                    "\n" +
                    "Mana, nihoyat o'shanda belgilangan muddatgacha bor-yo'g'i to'rt kun qoldi. Bo'zbola uchrashishni o'ylab quvonar va ayni chog'da ko'ngli xijil tortardi: bordi-yu qiz uni yodidan chiqarib yuborgan bo'lsa-chi? Axir, ularning shaharchasi yonidan qo'y haydab o'tadigan cho'ponlar son mingta.\n" +
                    "\n" +
                    "— Bo'lganicha bo'lar, — dedi u qo'ylariga. — Unchalik ahamiyati yo'q. Boshqa shaharlarda ham qizlar to'lib yotibdi.\n" +
                    "\n" +
                    "Biroq u ko'nglining tub-tubida buning ahamiyati chindan ham juda katta ekanini his etib turardi. Cho'ponlarda ham, dengizchi-yu jahongashta savdogarlarda ham doim intiq bo'lib, sog'inib yashaydigan bir shahri bo'ladi va u yerda, ozod qushday dunyo kezish baxtidan voz kechishga arziydigan hurliqo yashaydi.\n" +
                    "\n" +
                    "Kun yorishib ketdi, Santyago otarini quyosh ko'tarilib kelayotgan tarafga haydadi.\n" +
                    "\n" +
                    "\"Qo'ylarga oson, — o'yladi u, — hech qanday tashvishi yo'q. Ehtimol, shuning uchun ularning mendan ajralgisi kelmas\".\n" +
                    "\n" +
                    "Aslida ularga hech narsaning keragi yo'q — suv bo'lsa, tuyoqlari tagida o't-o'lan bo'lsa bas. Santyago Andalusiyaning qaerlarida sero't yaylovlar borligini bilsa bo'lgani, qo'ylar unga sodiq hamroh bo'lib, ergashib yuraveradi. Mayliga, kunlari bir zaylda o'taversin, ular tirikligida birorta ham kitob o'qimasa o'qimas, odamlarning shaharlarda, qishloqlarda bir-birlariga yangiliklarni yetkazadigan tilini ular tushunmasa ham mayliga — baribir ular o'zlaricha baxtli, suv va yemishga zoriqmasa bo'lgani. Bular evaziga qo'ylar saxiylik bilan o'z junini, naslini va vaqt-vaqti bilan go'shtini odamlarga beradi.\n" +
                    "\n" +
                    "\"Agar bugun men yirtqich hayvonga aylanib, ularga bir boshdan qiron solsam, otarning yarmidan ko'pini nobud qilganimdan keyingina ular nima bo'layotganini tushunib yetadi, — o'yladi Santyago. — Ular menga o'z instinktlaridan ko'ra ortiqroq ishonadi, chunki faqat men ularni qorin to'yg'azadigan joyga olib boraman\".\n" +
                    "\n" +
                    "U bugun miyasiga kelayotgan g'alati o'ylardan hayron. Ehtimol, qarg'ish tekkan, naqd mehrobidan tutanjir o'sib chiqqan xaroba cherkovda tunab qolgani uchun shunday bo'layotgandir? Uyqusida oldin ko'rgan bir tushni qayta ko'rdi, mana, endi sodiq hamrohlariga tish qayrayapti. U kechki ovqatdan qolgan vinodan bir qultum yutdi va kamzuliga yaxshilab burkanib oldi. Yana bir necha soatdan keyin quyosh chosh tepaga keladi, jazirama avjiga minib, suruvni yaydoq dalada haydashning iloji bo'lmay qoladi. Bu pallada butun Ispaniya mudraydi. Kechga boribgina havoning hovuri biroz tushadi, shungacha kun bo'yi yelkasida og'ir kamzulni ko'tarib yurishi kerak. Boshqa iloji ham yo'q-da: sahargi salqindan ayni shu kamzul jonni asraydi.\n" +
                    "\n" +
                    "\"Ob-havoning injiqliklariga shay turgan ma'qul\", — o'yladi Santyago kamzuliga tashakkur bildirib, uning og'ir va issiqligidan mamnun bo'lib. Aslida ham, kamzulning o'z vazifasi bo'lganiday, Santyagoning ham o'z qismati bor. Uning peshonasiga yozilgani — dashtu dala kezish. Ikki yil mobaynida u Andalusiyaning yassi tog'lariyu yaydoq dalalarini izg'ib, qancha shahar va qishloqlarni ko'rdi. Santyago movutchining qiziga, o'zi oddiy cho'pon esa-da, qanday qilib savodxon bo'lib olganini tushuntirishga chog'landi.\n" +
                    "\n" +
                    "Gap shunda ediki, u o'n olti yoshga to'lguncha diniy maktabda o'qidi. Ota-onasi uning ruhoniy bo'lishini — oddiy qishloq oilasining faxriga aylanishini orzu qilishardi. Ularning tirikchiligi qiyin kechar, tinim bilmay qilgan mehnatlari, xuddi qo'ylar singari, qorin to'yg'azishdan boshqaga ortmasdi.\n" +
                    "\n" +
                    "Santyago diniy maktabda lotinchani, ispancha va dinshunoslikni o'rgandi. Biroq go'dakligidayoq unda dunyoni ko'rishga ishtiyoq kuchli edi, bu tuyg'u Tangrini anglash yoki insoniyat gunohlarini miridan-sirigacha bilib olishdan ustun keldi. Va bir kuni ota-onasini ko'rgani kelganida, u yurak yutib, men ruhoniy bo'lishni xohlamayman, dedi. U yurt kezishni xohlardi.\n" +
                    "\n" +
                    "— O'g'lim, — dedi bu gapiga javoban otasi, — bizning qishlog'imizga kimlar kelib ketmadi. Butun dunyodan odamlar bu yerga biror-bir yangilik toparmikanman, deb kelishadi, biroq qanday kelishsa shunday qaytib ketishadi. Ular toqqa chiqishadi, ko'hna qasrni ko'raman deb va o'tmishning hozirgi zamondan afzal bo'lganiga guvoh bo'lishadi. Ularning, ehtimol, soch-lari oqdir yoki qora tanlidir ular, biroq bizning hamqishloqlardan hech bir ortiq joyi yo'q.\n" +
                    "\n" +
                    "— Biroq men bilmayman-ku, u yoqlarda, ular tug'ilgan o'lkalarda qanaqa qasrlar borligini, — e'tiroz bildirdi Santyago.\n" +
                    "\n" +
                    "— Bu odamlar bizning yerimizni, bizning ayollarimizni ko'rishganda, bu yerda umrbod qolgimiz keladi, deb gapirishadi, — davom etdi ota.\n" +
                    "\n" +
                    "— Men esa boshqa yerlarni ko'rishni, boshqa ayollarga qarashni xohlayman. Axir, bu odamlar hech qachon bizning qishloqda qolib ketishmaydi-ku.\n" +
                    "\n" +
                    "— Yurt kezish uchun ko'p pul kerak, bolam. Bizda muqim bir joyda yashamaydiganlar faqat cho'ponlar, xolos.\n" +
                    "\n" +
                    "— Iloj qancha, demak, cho'pon bo'laman, — dedi Santyago.\n" +
                    "\n" +
                    "Ota hech nima demadi, ertalab unga uchta qadimgi tilla tanga solingan hamyonni tut-qazdi:\n" +
                    "\n" +
                    "— Bir kun daladan topib olgandim. Osmondan tushgan desa ham bo'laveradi. O'zingga bir otar qo'y sotib ol va yurt kezib mol boqib yuraver, qachonki, dunyoda bizning qasrimizday eng zo'r qasr va bizning ayollarimizday go'zal ayol yo'qligini tushunsang, bir kun qaytarsan.\n" +
                    "\n" +
                    "O'g'lini tangriga topshirib fotiha berayotganda, Santyago uning ko'zlariga qarab, qarib qolganiga, muqim hayotning huzur-halovati: yeb-ichishi yetarli va boshida kapasi borligidan qoniqish hosil qilib, o'zini xotirjam tutishiga qaramay, otasining ko'nglida yurt oshib, el kezib yurish ishtiyoqi so'nmaganini payqadi.\n" +
                    "\n" +
                    "Ufq qirmizi tusga kirdi, so'ng quyosh botdi. Otasining gaplarini eslab kulimsiradi: u ko'plab qasrlarni va ko'plab go'zallarni ko'rishga ulgurdi, darvoqe, ular orasida tengi yo'q bir hurliqo bilan ikki kundan keyin tag'in uchrashadi. Uning bir otar qo'yi bor, egnida kamzuli bor, kitobi bor, kitobni xohlagan paytda boshqasiga almashtirsa bo'ladi. Muhimi — uning eng aziz orzusi amalga oshayotir: dashtu dala kezib, safar qilib yuribdi. Andalusiyaning qir-adirlari zeriktirsa, xohlagan paytda qo'ylarni sotib, dengizchi bo'lishi mumkin. Agar dengizda suzish joniga tegsa, bu paytga kelib u boshqa shaharlarni ko'rib, boshqa ayollar bilan tanishib oladi, baxtli bo'lishning boshqacha yo'llarini topadi.\n" +
                    "\n" +
                    "\"Bilmadim, diniy maktabda Tangrini qanday topardim\", — o'yladi Santyago ko'tarilib kelayotgan quyoshga qarab.\n" +
                    "\n" +
                    "O'zining safarlarida u doim noma'lum yo'llardan yurishni ma'qul ko'rardi. Bu cherkovda hali biror marta tunashga to'g'ri kelmagan, garchi bu o'lkalarda tez-tez bo'lib tursa-da. Dunyo keng, cheku chegarasi yo'q va Santyago ozroq vaqt qo'ylarni o'z mayliga qo'yib bersa, albatta, qandaydir qiziq voqeaga duch kelardi. Faqat qo'ylar har kuni yangi yo'llarni topishayotganini, yaylovlar va yil fasllari o'zgarayotganini tushunmaydi: ularning miyasida faqat qorin to'yg'azish ehtiyoji bor, xolos.\n" +
                    "\n" +
                    "\"Ehtimol, biz ham shunaqadirmiz, — o'yladi cho'pon. — Axir, men o'zim ham movutchining qizi bilan tanishganimdan keyin xayolim biror marta ham boshqa ayollarga ketmadi-ku\".\n" +
                    "\n" +
                    "U osmonga qaradi, chamaladi, peshinga qolmay Tarifda bo'ladi. U yerda kitobni boshqasiga, qalinrog'iga almashtirib olsa, suvdonini vinoga to'ldirib, soch-soqolini oldirsa, movutchining qizi bilan uchrashuvga shay bo'ladi. U boshqa bir cho'pon qizni ilib ketgan bo'lsa-chi, degan xayolga bormaslikka urindi.\n" +
                    "\n" +
                    "\"Hayot shunisi bilan qiziqki, tushlar rostga aylanadi\", — o'yladi Santyago osmonga ko'z tashlab qo'yib, qadamini tezlatarkan.\n" +
                    "\n" +
                    "U Tarifda tushni ta'birlaydigan kampir yashashini esladi. Qani aytsin-chi, ikki marta ko'rgan bir tushning ta'biri qanaqa bo'larkan.\n" +
                    "\n" +
                    "Kampir mehmonni orqa tarafdagi oshxonadan turli\n" +
                    "\n" +
                    "rangdagi plastmassa munchoqlar shodasidan yasalgan parda bilan ajratilgan xonaga yo'lladi. Xonada stol va ikkita stul bor, devorda Masih yuragi tasviri tushirilgan surat ilingan.\n" +
                    "\n" +
                    "Uy bekasi Santyagoni o'tirg'izdi, o'zi uning qarshisiga o'tirib, ikki qo'lidan ushladi va past ovozda duo o'qidi.\n" +
                    "\n" +
                    "Aftidan, bu lo'lilar o'qiydigan duo edi. Cho'pon bolaga lo'lilar tez-tez uchrab turardi — ular ham, garchi qo'y boqishmasa-da, dunyo kezib yurishadi. Odamlar ularni yolg'on-yashiq aytib kun kechiradi, gunohga botib yashaydi, bolalarni o'g'irlab ketadi va bu bolalar keyinchalik ularning asiriga aylanib qoladi, deyishadi. Santyago go'dakligida lo'lilar o'g'irlab ketishidan o'lguday qo'rqardi, hozir lo'li kampir qo'llaridan ushlaganda vujudida o'sha qo'rquv uyg'ondi.\n" +
                    "\n" +
                    "\"Axir, bu yerda Muqaddas Masih yuragi bor-ku\", — o'yladi u xotirjam bo'lishga va titrog'ini bosishga urinib. Lo'li kampir buni sezib qolishini xohlamasdi. Sodiqligini ta'kidlamoqchi bo'lib ichida duo o'qidi.\n" +
                    "\n" +
                    "— Juda qiziq, — kaftidagi chiziqlardan ko'zini uzmay\n" +
                    "\n" +
                    "ming'irladi kampir va yana sukut saqlab turdi.\n" +
                    "\n" +
                    "Bo'zbola battar bezovtalandi. Titroq endi qo'llariga ko'chdi va u qo'llarini shoshib tortib oldi.\n" +
                    "\n" +
                    "— Men sening oldingga qo'llarimga qarab fol och deb kelganim yo'q, — dedi u lo'lining uyiga qadam bosganiga afsuslanib: yaxshisi, haqini to'lab, tezroq juftakni rostlasammikan. Shuyam gap bo'ldimi, allaqanday tushni ikki marta ko'rgan bo'lsa ko'ribdi-da.\n" +
                    "\n" +
                    "— Bilaman. Sen ko'rgan tushingning ta'birini aytib berishimni so'rayapsan, — dedi lo'li. — Tushlar — bu Tangri biz bilan gaplashadigan til. Modomiki, bu dunyodagi bor tillardan biri ekan, bu tildan men tarjima qila olaman. Biroq Tangri senga qalbing tilida murojaat qilgan ekan, uning aytganlari faqat yolg'iz sengagina tushunarli bo'ladi. Shunisi ham borki, sen maslahat olish uchun kelgan ekansan, men sendan baribir pul olaman.\n" +
                    "\n" +
                    "\"Aftidan, ilindim\", — o'yladi Santyago, biroq chekinishning endi iloji yo'q. Jur'at cho'pon uchun — odatdagi hol: birida suruvga bo'ri oralaydi, birida qurg'oqchilik ro'y beradi. Jur'at uning hayotini qiziqarli qiladi.\n" +
                    "\n" +
                    "— Men bir tushni ikki marta ko'rdim, — dedi u. — Tushimda yaylovda qo'ylarimni boqib yuribman, shu payt go'dak paydo bo'ldi, u qo'ylar bilan o'ynagisi keldi. Birovning qo'ylarimga yaqinlashishini yomon ko'raman, ular begonadan hurkadi. Faqat bolalarni qo'rqmay yaqiniga yo'latadi, nega undayligini bilmayman. Qo'ylar bolalarning yoshini qanday payqashini tushunmayman.\n" +
                    "\n" +
                    "— Ko'rgan tushingni ayt, — kampir uning so'zini bo'ldi, — ana, qozonim olovda turibdi. Sening puling ko'p emas, mening vaqtim qimmat turadi.\n" +
                    "\n" +
                    "— Bola hadeb qo'ylar bilan o'ynadi, — Santyago biroz iymanib davom etdi, — keyin tuyqusdan meni qo'lida ko'tardi-da, Misr ehromlariga eltib qo'ydi.\n" +
                    "\n" +
                    "U biroz sekinlab, bu lo'li kampir ehrom nimaligini bilarmikan, degan shubhaga bordi.\n" +
                    "\n" +
                    "— Misr ehromlariga eltdi, — takrorladi u ohista va dona-dona qilib, — u yerda menga: \"Agar yana bu yerga kelib qolsang, bekitilgan xazinani izlab topasan\", dedi. Va endi menga xazina qaerda yotganini uqtirmoqchi bo'lganida uyg'onib ketdim. Ikkinchi marta ham bu tush xuddi shunday — hech o'zgarishsiz qaytarildi.\n" +
                    "\n" +
                    "Lo'li kampir uzoq jim qoldi, keyin yana Santyagoning qo'llaridan ushladi va kaftiga sinchiklab diqqat bilan qaradi.\n" +
                    "\n" +
                    "— Hozircha men sendan haq olmayman, — dedi kampir nihoyat. — Biroq agar xazinani topsang, o'ndan biri meniki.\n" +
                    "\n" +
                    "Bo'zbola sevinganidan kulib yubordi, tushiga kirgan xazina uning folbinga beradigan arzimas chaqalarini asrab qoldi. Bu kampir chindan ham lo'li: lo'lilarning bir qaynovi ichida, deyishadi.\n" +
                    "\n" +
                    "— Bo'laqol, tushimning ta'birini ayt, — so'radi u.\n" +
                    "\n" +
                    "— Oldin qasam ich. Xazinaning o'ndan birini menga beraman, deb qasam ich, keyin ta'birini aytaman.\n" +
                    "\n" +
                    "Qasam ichishiga to'g'ri keldi. Biroq kampir Muqaddas Masih yuragi tasviriga qarab qasamni takrorlashini talab qildi.\n" +
                    "\n" +
                    "— Bu tush Umum Tilida, — dedi kampir. — Men uni ta'birlashga harakat qilaman, garchi bu juda qiyin bo'lsa-da. Ana shu mehnatim uchun men sendan xazinaning o'ndan birini so'rayapman. Eshit: sen Misrga borishing va o'zigning ehromingni topishing kerak. Men o'zim bu narsani eshitmaganman, biroq go'dak senga ularni ko'rsatibdimi, demak, haqiqatan bu bor narsalar. Ana endi jo'na — u yoqda sen o'zingning xazinangni topasan, boyib ketasan.\n" +
                    "\n" +
                    "Santyago avvaliga hayron qoldi, keyin afsuslandi. Shu bo'lmag'ur gap uchun kampirni qidirib o'tirish shartmidi. Yaxshiyam, undan pul olmadi.\n" +
                    "\n" +
                    "— Seni deb vaqtim bekor ketdi, — dedi u.\n" +
                    "\n" +
                    "— Men ogohlantirdim: sening tushingni ta'birlash qiyin. G'aroyib ko'ringan narsa, sirtdan oddiyday tuyulsa-da, biroq uning mag'zini chaqishga faqat donolar qodir. Men dono bo'lmaganim uchun ham boshqa hunarni, masalan, kaftga qarab fol ochishni o'rgandim.\n" +
                    "\n" +
                    "— Qanday qilsam Misrga bora olaman?\n" +
                    "\n" +
                    "— Bu mening bosh og'rig'im emas. Men faqat tushni ta'birlay olaman, uni chinga aylantirish mening ishimmas. Aks holda shunday qashshoq yasharmidim, tuqqan qizlarimdan sadaqa so'rab.\n" +
                    "\n" +
                    "— Agar Misrga bora olmasam-chi?\n" +
                    "\n" +
                    "— Borolmasang — ko'rgan folim uchun sen beradigan haqdan quruq qolaman. Bu birinchi marta bo'layotgani yo'q. Endi jo'na, sen bilan gaplashadigan gap qolmadi.\n" +
                    "\n" +
                    "Santyago lo'li kampirnikidan butkul hafsalasi pir bo'lib chiqdi va minbad tushlarga ishonmaslikka qaror qildi. Shu payt, ishlarga kirishish kerakligi xayoliga keldi: do'konga yo'l oldi, yegani ul-bul xarid qildi, kitobini qalinrog'iga almashtirdi, yangi vinoni tatib ko'rmoqchi bo'lib, maydondagi o'rindiqqa o'tirdi. Kun juda issiq edi, vino sehrli tarzda bo'zbolaning hovurini bosdi.\n" +
                    "\n" +
                    "U qo'ylarini shahar chetida, yaqinda tanishgan do'stining molxonasi yonida qoldirdi. Viloyatning hamma joyida Santyagoning jo'ralari bor edi — shuning uchun ham u yurt kezib yurishni yaxshi ko'rardi. El oralasang yangi do'st orttirasan — u bilan har kuni ko'rishib turish hecham shart emas. Atrofingda doim bir xil odamlar bo'lsa — xuddi diniy maktabda o'qib yurgan paytdagiday — o'z-o'zidan ular sening hayotingga aralasha boshlaydi. Hayotingga aralashib turib, biroz vaqt o'tgach, uni o'zgartirgilari kelib qoladi. Agar sen ular xohlaganday bo'la olmasang — arazlashadi. Har kim o'zicha bu dunyoda aynan qanday yashash kerakligini aniq biladi.\n" +
                    "\n" +
                    "Biroq hech kim o'zining shaxsiy hayotini negadir yo'lga sola olmaydi. Bu xuddi lo'li kampirning amaliga o'xshaydi, u tushlarni ta'birlaydi, lekin rostga aylantirishga qurbi yetmaydi.\n" +
                    "\n" +
                    "Santyago quyoshning botishini kutishga qaror qildi, shundan so'ng qo'ylarni yaylovga haydasa bo'ladi. Movutchining qizi bilan uchrashishga hali uch kun bor. Hozir esa shu yerlik ruhoniydan almashtirib olgan kitobni o'qishga kirishdi. Kitob qalin edi, birinchi betida kimningdir dafn marosimi tasvirlangan va boz ustiga qahramonlarning ismlari shunaqa g'alatiki, ovoz chiqarib aytsang tiling qoqilib ketadi. \"Agar bir kun kelib men kitob yozadigan bo'lsam, — o'yladi bo'zbola, — kitobimning har bir betida yangi qahramon bo'ladi, kitobxonlar kimning ismi qanaqaligini eslab ovora bo'lib o'tirmaydi\".\n" +
                    "\n" +
                    "U endi kitobni ochib, marhumni qorga qanday ko'mishgani tasvirini berilib o'qiyotganida (tepadan quyosh ayovsiz kuydirib turganiga qaramay, Santyagoning eti junjikdi), bir qariya kelib, uning yoniga cho'kdi va uni gapga tortdi.\n" +
                    "\n" +
                    "— Ular nima qilishayapti o'zi? — maydondagi odamlarni ko'rsatib, so'radi u.\n" +
                    "\n" +
                    "— Ishlashayapti, — ro'yxush bermay javob qildi bo'zbola, go'yo o'zini berilib kitob o'qiyotganday ko'rsatib.\n" +
                    "\n" +
                    "Aslida esa u muvutchining qizining ko'z o'ngida to'rtta qo'yning junini qanday qirqishini o'ylardi. Chunki qiz uning nimaga qodirligini ko'radi. Santyago bu manzarani tez-tez ko'z oldiga keltirar va har gal xayolida qiziqib qarab turgan qizga qo'yni dumidan boshlab boshi tomonga qirqib borish kerakligini tushintirardi. U yana bir qancha g'aroyib voqealarni ham xotirasida jamlab, qo'ylarni qirqayotib, ularni qizga aytib berishga chog'lanardi. Bu voqea-larni kitoblardan o'qib olgan edi, biroq bularni o'z boshidan kechirganday qilib aytib bermoqchi edi. Qiz hech qachon buning tagiga yetolmaydi: chunki u o'qishni bilmaydi-da.\n" +
                    "\n" +
                    "Qariya juda qaysar chiqib qoldi. Chanqab ketganini aytib, bir qultum vino so'radi. Santyago ko'zani uzatib, shu bilan undan qutilishga umidlandi.\n" +
                    "\n" +
                    "Qayoqda — qariyaning jag'i battar ochildi, gurunglashgisi keldi. Ko'zani uzatayotib, bo'zboladan qanday kitob o'qiyotganini so'radi. Santyagoning boshqa o'rindiqqa o'tib o'tirgisi keldi, biroq otasi unga keksalarga doimo xushmuomalada bo'lishni nasihat qilgandi, shu bois u bir so'z demay kitobni qariyaga uzatdi: ehtimol, kitobning nomini to'g'ri o'qishni u bilar. Agar chol savodsiz bo'lsa, o'zi uni tinch qo'yar, noqulay holga tushib qolmay deb.\n" +
                    "\n" +
                    "— Him… — dedi qariya kitobni qo'lida aylantirib ko'rarkan, go'yo bunday g'alati buyumga birinchi marta ko'zi tushganday. — Yaxshi kitob, zarur narsalar haqida, biroq nihoyatda zerikarli.\n" +
                    "\n" +
                    "Santyago ajablandi: qariya, demak, nafaqat o'qishni bilarkan, hatto ayni shu kitobni o'qib chiqqan ekan. Nachora, agar chindan zerikarli bo'lsa, hali uni boshqasiga almashtirib olishga vaqt bor.\n" +
                    "\n" +
                    "— Bu kitobda ham, deyarli boshqa barcha kitoblarda bor gaplar yozilgan, — davom etdi qariya. — Ya'ni odam o'z taqdirini o'zi tanlay olmasligi haqida. Bu kitobdagi bor gap odamlarni dunyodagi eng katta yolg'onga ishontirishdan iborat.\n" +
                    "\n" +
                    "— Qanaqa u bu dunyodagi eng katta yolg'on? — ajablandi Santyago.\n" +
                    "\n" +
                    "— Mana shunaqa: qandaydir lahzalarda hayotimiz tizgini qo'limizdan chiqib ketadi va uni beixtiyor taqdir boshqara boshlaydi. Uchiga chiqqan uydirma.\n" +
                    "\n" +
                    "— Men uchun, nazarimda, buni tushunish qiyin, — dedi Santyago. — Meni, masalan, ruhoniy qilmoqchi bo'lishgandi, men esa cho'ponlikka ketdim.\n" +
                    "\n" +
                    "— Shunisi ma'qul-da, — boshini sermadi qariya. — Sen yurt kezib yurishni yaxshi ko'rasan-ku.\n" +
                    "\n" +
                    "\"Mening fikrlarimni o'qiyotganga o'xshab gapiradi\", — o'yladi bo'zbola.\n" +
                    "\n" +
                    "Bu orada qariya kitobni qaytib berishni xayoliga ham keltirmayotganday, bamaylixotir varaqladi. Faqat hozir Santyago qariyaning egnida arabcha yaktak borligini payqadi — aslida buning ajablanadigan joy yo'q: Tarifni Afrika qirg'og'idan torgina bo'g'oz ajratib turadi, uni bir necha soatda suzib o'tish mumkin. Arablarni shaharchada tez-tez uchratasan — ular bir nimalar sotib olishadi, bir kunda bir necha bor o'zlarining g'alati ibodatlarini amalga oshirishadi.\n" +
                    "\n" +
                    "— Siz qaerliksiz? — so'radi u qariyadan.\n" +
                    "\n" +
                    "— Hammaerlik.\n" +
                    "\n" +
                    "— Bunday bo'lmaydi-ku, — e'tiroz bildirdi bo'zbola. — Hech kim hammaerlik bo'la olmaydi. Mana men, masalan, cho'ponman, dashtu dalalarni kezib yuraman, biroq bir joyda tug'ilganman, shaharchada, eski qasr turgan tog' yonidagi. Shu shaharchada men tug'ilganman.\n" +
                    "\n" +
                    "— Xo'p, unday bo'ladigan bo'lsa, men Salimda tug'ilganman.\n" +
                    "\n" +
                    "Santyago bilmasdi Salim qaerdaligini, biroq so'rab o'tirmadi, qizarib qolmay deb. U tashvishli qiyofadagi yo'lovchilar tinimsiz o'tib-ketib turgan maydonga tikilib qarab turdi.\n" +
                    "\n" +
                    "— Xo'sh, Salimda hayot qanday?\n" +
                    "\n" +
                    "— Odatdagiday.\n" +
                    "\n" +
                    "Bilib olishning hech iloji yo'q edi. Faqat bunday shahar Andalusiyada yo'qligi ayon edi, aks holda Santyago uni eshitgan yoki ko'rgan bo'lardi.\n" +
                    "\n" +
                    "— U yerda siz nima ish bilan mashg'ulsiz?\n" +
                    "\n" +
                    "— Nima ish bilan mashg'ulman? — Qariya \"qah-qah\" otib kulib yubordi. — Men uni boshqaraman. Men — Salim podshohiman.\n" +
                    "\n" +
                    "\"Odamlarga bir balo dorigan o'zi, — o'yladi bo'zbola. — Haqiqatan, tilsiz qo'ylar bilan andarmon bo'lib yurganim ma'qul aslida, yemishi bilan suvi bo'lsa bas. Yoki kitob o'qiganim tuzuk — g'aroyib voqealarni bilib olasan, qachon xohlasang ochib o'qiyverasan. Biroq odamlar bilan qiyin: tomdan tarasha tushganday bir nimani aytadi, o'tirasan keyin ustingga mag'zava to'kilganday, nima deb javob berishni bilmay\".\n" +
                    "\n" +
                    "— Mening ismim Malkisidq, — ming'irladi qariya. — Qo'ying nechta?\n" +
                    "\n" +
                    "— Ko'p, — mujmal javob qildi Santyago.\n" +
                    "\n" +
                    "— To'g'risi qancha? Demak, senga mening yordamim kerakmas, qo'ying yetarli, deb hisoblasang.\n" +
                    "\n" +
                    "Bo'zbolaning chindan jahli chiqdi. Hech qanday yordam so'rab o'tirmadi. Gapni qariyaning o'zi boshladi-da, avval vino so'radi, keyin kitobni ko'ray dedi, endi unga gurung berishing kerak.\n" +
                    "\n" +
                    "— Kitobni bering, — dedi u. — Men yo'lga chiqishim kerak.\n" +
                    "\n" +
                    "— Menga otaringning o'ndan birini bersang — xazinaga qanday yetib borishni o'rgataman.\n" +
                    "\n" +
                    "Tuyqusdan bo'zbolaga hammasi ayon bo'ldi-qoldi. Lo'li kampir undan sariq chaqa ham so'ramadi, demak, qariya — u, ehtimol kampirning eri, o'zi ham lo'li bo'lsa kerak, bir dunyo yolg'on-yashiq gaplarni to'qib, ko'proq pul undirish uchun atay jo'natilgan.\n" +
                    "\n" +
                    "Biroq Santyago gapga og'iz juftlashga ulgirmay, qariya yerdan bir shoxchani olib, qumga nimalarnidir chizdi. U egilgan chog'da ko'kragida nimadir shunaqa nur taratib yaraqladiki, bo'zbola bir lahza ko'r bo'lib qoldi. Biroq qariya qartaygan yoshiga mos bo'lmagan bir harakat bilan libosiga burkanib oldi, Santyagoning ko'zi ko'ra boshlaganda, u oyoqlari ostida qariya chizgan shakllarni ko'rdi.\n" +
                    "\n" +
                    "Kichkina shaharning bosh maydonini qoplagan qumda u ota-onasining ismlarini va o'zining butun hayotini ayni daqiqalargacha — bolalikdagi o'yinlari-yu diniy maktabdagi sovuq kechalarni — hamma-hammasini o'qidi. U do'kondor qizining ismini o'qidi, buni endi bilishi edi. U hali hech kimga aytmagan narsalarni: bir safar ki-yik ovlash uchun otasining miltig'ini so'ramasdan olganini va hayotida dastlab, faqat bir marta ayol bilan tunaganini o'qidi.\n" +
                    "\n" +
                    "\"Men — Salim podshohiman\", — yodiga tushdi uning.\n" +
                    "\n" +
                    "— Nega podshoh cho'pon bilan gaplashib o'tiribdi? — xijolatomuz, yuvosh tortib so'radi Santyago.\n" +
                    "\n" +
                    "— Buning sabablari ko'p, biroq eng asosiysi shuki, sen o'z Taqdiring yo'lidan borishga qodirsan.\n" +
                    "\n" +
                    "— Bu qanaqa Taqdir? — so'radi bo'zbola.\n" +
                    "\n" +
                    "— Barcha odamlar, hali navqiron paytlarida, o'z Taqdirini bilishadi. Umrning bu pallasida hamma narsa tushunarli va o'zlari xohlagan ishni amalga oshirishga intilishdan qo'rqishmaydi. Biroq vaqt o'tishi bilan bir sirli kuch ularni o'z Taqdirini yuzaga chiqarishga erishishning iloji yo'qligiga ishontirishga kirishadi.\n" +
                    "\n" +
                    "Qariyaning gaplari Santyagoga unchalik ta'sir qilmadi, biroq \"sirli kuch\" uni qiziqtirib qoldi — do'kondorning qizi buni eshitsa, og'zi ochilib qoladi.\n" +
                    "\n" +
                    "— Bu kuch aftidan yomonlikka yo'g'rilgan. Biroq amalda u odamlarni o'z Taqdirini qanday yuzaga chiqarishga yo'naltiradi. Bu kuch uning ruhi va irodasini shunga tayyorlab boradi. Bu sayyorada bir ulug' haqiqat mavjud: sening kimligingdan va nima qilayotganingdan qat'i nazar, qachonki sen bir nimani chin yurakdan istasang, bunga erishasan, chunki shunday istak Olam Qalbida ham yaraladi. Va bu sening Yerdagi nasibangdir.\n" +
                    "\n" +
                    "— Hatto agar men faqat yurt kezib yurishni yoki do'kondorning qiziga uylanishni xohlasam hammi?\n" +
                    "\n" +
                    "— Yoki xazinani qidirsang-da. Olam Qalbi inson baxtidan oziqlanadi. Baxtidan, biroq ayni paytda g'amidan, havasu hasadidan, rashkidan ham. Odamning yakka-yagona majburiyati: o'z Taqdiri yo'lidan oxirigacha borish. Hammasi — shunda mujassam. Yodingda tut, sen biror narsani istagan paytda butun Olam sening istaging amalga oshishiga yordam beradi.\n" +
                    "\n" +
                    "Biroz muddat ular maydonga va o'tib-ketib turgan odamlarga jim qarab o'tirishdi. Jimlikni birinchi bo'lib qariya buzdi:\n" +
                    "\n" +
                    "— Xo'sh, shunday qilib nega endi sen qo'y boqishga qaror qilding?\n" +
                    "\n" +
                    "— Chunki, dunyo kezib yurishni yaxshi ko'raman.\n" +
                    "\n" +
                    "Qariya maydon burchagiga qizil kajavasi bilan kelib to'xtagan makkabodroq sotuvchiga ishora qildi:\n" +
                    "\n" +
                    "— Bolaligida u ham dunyo kezishni orzu qilgan. Biroq keyin makkabodroq sotib, pul topishni afzal bildi. Qarigach, u Afrikada bir oyni o'tkazdi. O'z orzusini amalga oshirishi uchun odamda hamma vaqt imkon bo'lishini tushunish unga nasib etmagan.\n" +
                    "\n" +
                    "— Uning cho'ponlik qilgani ma'qul edi, — dedi Santyago.\n" +
                    "\n" +
                    "— Bu haqda u o'yladi. Biroq so'ng yaxshisi savdo-sotiq bilan shug'ullanishga qaror qildi. Savdogarlarning boshida kapasi bor, cho'pon-cho'liqlar esa ochiq dalada tunaydi. Qizlarning ota-onalari ham kuyovlari cho'pon emas, savdogar bo'lishini xohlashadi.\n" +
                    "\n" +
                    "Santyago movutchining qizini esladi va yuragiga igna sanchilganday bo'ldi. Albatta, qiz yashayotgan o'sha shaharda kimdir qizil kajava bilan izg'ib yurgandir.\n" +
                    "\n" +
                    "— Bundan kelib chiqadiki, odamlarning cho'ponlar va makkabodroq sotuvchilar haqidagi fikrlari Taqdir yo'li haqidagi fikrdan muhim ekan-da.\n" +
                    "\n" +
                    "Qariya yana kitobni varaqladi va aftidan, o'qiy boshladi. Santyago uzoq kutdi, keyin bari bir qariyani chalg'itishga qaror qildi, chunki oldin chol ham uni kitob-dan chalg'itgandi:\n" +
                    "\n" +
                    "— Nima uchun siz men bilan bu haqda gaplashayapsiz?\n" +
                    "\n" +
                    "— Chunki sen o'zingning Taqdiring yo'lidan borishga urinding. Biroq hozir undan chekinishga tayyorsan.\n" +
                    "\n" +
                    "— Siz har doim shunday daqiqalarda paydo bo'lasizmi?\n" +
                    "\n" +
                    "— Har doim. Boz ustiga boshqa shaklu shamoyilda ham ko'rinishim mumkin. Gohida to'g'ri qaror tarzida, gohida ma'qul fikr tarzida. Gohida esa, hal etuvchi daqiqada, men boshi berk ko'chadan chiqish yo'lini aytaman. Barini eslab qololmaysan. Biroq odatda odamlar mening paydo bo'lganimni payqashmaydi.\n" +
                    "\n" +
                    "Qariya o'tgan hafta bir tilla qazuvchi qoshida tosh shaklida paydo bo'lgani haqida hikoya qildi. Bir paytlar bu odam hammasini tashlab, zumrad qazib topish uchun yo'l olgan. Daryo qirg'og'ida besh yil rosa ter to'kkan va bir dona bo'lsa-da, zumrad toparman, deb 999 999 toshni maydalagan. Va shunda hafsalasi pir bo'lib, orzusidan voz kechishga ahd etgan, bu payt uning poyida faqat bittagina tosh qolgandi — va u shu toshning ichidan o'zining zumradini topardi. Shunda qariya aralashishga va o'z Yo'lidan mardona ketayotgan tilla izlovchiga yordam berishga qaror qildi. U toshga aylandi, uning oyog'i ostiga yumalab keldi, biroq tilla izlovchi, besh yildan beri besamar ter to'kayotganidan g'azabga minib, oyog'i bilan toshni tepib yubordi. Biroq shunday kuch bilan tepdiki, tosh boshqa bir toshga urilgancha yorilib, dunyoda tengsiz go'zal zumrad quyosh nurida yaraqlab ketdi.\n" +
                    "\n" +
                    "— Odamlarga o'z hayotlarining mohiyati juda erta ayon bo'lib qolganday tuyuladi, — dedi qariya va Santyago uning ko'zlaridagi g'amni ilg'adi. — Ehtimol, shuning uchun ham ular bundan juda erta voz kechishar. Nachora, dunyo shunday qurilgan.\n" +
                    "\n" +
                    "Shu payt bo'zbola gurung xazina haqidagi gapdan boshlanganini esladi.\n" +
                    "\n" +
                    "— Ma'danni soy va daryolar yuzaga olib chiqadi, ayni soy va daryolar ularni yer qa'riga bekitadi, — dedi qariya. — Agar o'zingning xazinang haqida batafsil bilging kelsa — suruvingdagi qo'ylarning har o'ntasidan birini menga ber.\n" +
                    "\n" +
                    "— Balki topsam, o'sha xazinaning o'ndan birini berganim tuzukdir?\n" +
                    "\n" +
                    "— Qo'lingda yo'q narsani va'da qilish, uni qo'lga kiritishga jahd etish demak, — dedi qariya ginali ohangda.\n" +
                    "\n" +
                    "Shunda Santyago suruvining o'ndan birini lo'li kampirga allaqachon va'da qilganini aytdi.\n" +
                    "\n" +
                    "— Lo'lilar haqini undirishni biladi, — xo'rsindi qariya. — Nima bo'lganda ham bilib qo'yganing tuzuk, dunyoda har bir narsaning o'z bahosi bor. Nur Askarlari ayni shunga o'rgatishga intilishadi. — U Santyagoga kitobni uzatdi. — Ertaga shu vaqtda sen suruvingning o'ndan birini qoshimga haydab kelasan. Shunda men xazinani qanday topishni aytaman.\n" +
                    "\n" +
                    "Va shunday deb, u muyulishda ko'zdan g'oyib bo'ldi.\n" +
                    "\n" +
                    "Santyago yana kitobni qo'liga oldi, biroq mutolaga kirisholmadi — diqqatini bir joyga yig'ishga qurbi yetmasdi. Qariya bilan muloqotdan hayajonlagandi, chunki uning ko'ngli sezdi: qariya haqiqatni gapirdi-da. Bo'zbola chakana savdo qutisi yoniga bordi va bir qog'oz xaltacha makkabodroq sotib oldi, sotuvchiga qariyaning u haqdagi gapini aytsammikan, deb o'yladi, keyin shart emas, degan qarorga keldi.\n" +
                    "\n" +
                    "\"Ba'zida hammasini o'z holicha qoldirgani ma'qul\" — deb o'yladi u. Aytsang, sotuvchi, g'ildirakli qizil qutisiga o'rganib qolganiga qaramay, uch kunlab o'ylanib yuradi, bu ishning bahridan o'tsammikan, deb. \"Uni bunday azobdan xolos etganim bo'lsin\".\n" +
                    "\n" +
                    "Shunday o'y bilan Santyago ko'cha bo'ylab, boshi oqqan tomonga qarab ketdi, oxiri bandargohga kelib qoldi, chog'roqqina uychaning yonidan chiqdi. Uychada Afrikaga boradigan kemalarga patta sotishardi. Darvoqe, Misr aynan Afrikada.\n" +
                    "\n" +
                    "— Sizga nima kerak? — so'radi pattafurush.\n" +
                    "\n" +
                    "— Ehtimol, ertaga sizdan patta xarid qilarman, — javob qildi Santyago va nari yurdi.\n" +
                    "\n" +
                    "Bittagina qo'yni sotsang bas, qarabsanki, Afrikadasan. Bu fikr uning ko'ngliga g'ulg'ula soldi. Pattafurush esa yoramchisiga gap qotdi:\n" +
                    "\n" +
                    "— Yana bitta xayolparast. Sayohat qilgilari kelibdi, kissasida hemiri yo'q.\n" +
                    "\n" +
                    "Santyago pattaxona tokchasi oldida turarkan, qo'ylari yodiga tushdi va tuyqusdan ularning yoniga tezroq borgisi kelib qoldi. Ikki yilda cho'polik san'atini egalladi va chorvani miridan-sirigacha — qo'y qirqishni-yu qo'zilatishni, suruvni bo'rilardan asrashni bilib oldi. Andalusiyaning yaylovlari endi unga besh barmog'iday tanish, otaridagi xohlagan qo'yining narxini aniq baholay biladi.\n" +
                    "\n" +
                    "U o'zini kutayotgan suruv qamalgan qo'tonga eng uzoq yo'ldan jo'nadi. Bu shaharning ham o'z qal'asi bor edi, bo'zbola qiyalikdan ko'tarilib, qal'a devoriga chiqib o'tirishga qaror qildi. U joydan Afrika ko'rinardi. Bir paytlar kimdir unga qadim zamonda Afrikadan mavrlar suzib kelishib, sal bo'lmasa Ispaniyani butunlay mahv etashganini uqtirgandi. Santyago mavrlarga toqat qilolmasdi: bu yerga lo'larni shular olib kelgan bo'lishi kerak.\n" +
                    "\n" +
                    "Devordan butun shahar, haligina u qariya bilan gurunglashib turgan bozor maydoni kaftdagiday ko'rinib turardi.\n" +
                    "\n" +
                    "\"Qaysi go'rdanam uni uchratdim\", — o'yladi bo'zbola.\n" +
                    "\n" +
                    "Hamma balo lo'li kampirning tushni ta'birlaganidan boshlandi-da. Na lo'li, na qariya uning cho'pon ekaniga ahmiyat berdi. Ha, hamma narsadan ko'ngli sovugan bu yolg'iz odamlar cho'pon degan zot qo'y bilan tirik ekanini qaydan bilsin. Santyago suruvdagi har qaysi qo'yning bir qarashdayoq ichi-sirtini aytib bera oladi: unisi — qisr, narigisi ikki oydan so'ng qo'zilaydi, hov, chetdagilari — suruvning eng sudralganlari, yalqov. U qo'ylarni qirqishni, bo'g'izlashni uddalaydi. Agar biror yoqqa ketguday bo'lsa, qo'ylari uni qumsaydi, egasiz bo'lib qoladi.\n" +
                    "\n" +
                    "Shamol turdi. Bu shamol unga tanish edi — odamlar buni \"lavanta shamoli\" deyishardi, chunki O'rtaer dengizining sharqiy qismidan, Lavantadan kelgan mavrlarning yelkanlarini ko'targan shu shamol edi. Bo'zbola, hali Tarifda bo'lmagan esa-da, Afrika qirg'oqlari juda yaqin ekaniga shubhalanmasdi. Bunday qo'shnilik xatarli — mavrlar yana bostirib kelishi mumkin. Shamol kuchaydi. \"Baribir qo'ylarim va xazina bilan oramizni buzib yuborolmas\", — o'yladi Santyago. Endi ikkisidan birini — yo o'zi odatlangan mashg'ulotni yoki ko'ngli tusab turgan narsani deyishi kerak. Aytgancha, o'rtada do'kondorning qizi ham bor, biroq qo'ylar muhimroq, chunki ular Santyagoga muhtoj. Qizaloqqa — baribir. Darvoqe, uni eslarmikan? Bo'zbola adashmas-ov: ikki kundan keyin uning oldida paydo bo'lsa, qizaloq tanimaydi, chunki qizaloq uchun kunlar bir xilda o'tadi, kunlari ikki tomchi suvday yakrang odamlar har tong quyosh charaqlab chiqib, turmushiga ro'shnolik bag'ishlayotganini payqashmaydi.\n" +
                    "\n" +
                    "\"Men otamni, onamni ham, tug'ilgan qishlog'imdagi qal'ani ham tashlab keldim, — o'yladi u. — Ular ayriliqda yashashga ko'nikishdi, men ham shunga odatlandim. Demak, bunga qo'ylar ham ko'nikadi mening yo'g'imda\".\n" +
                    "\n" +
                    "U yana maydonga tepadan turib qaradi. Makkabodroq savdosi qizigandan qizirdi: ana, qariya bilan haligina gurunglashgan so'rida endi bir juft oshiq qaymoqlashib o'tirishibdi.\n" +
                    "\n" +
                    "\"Savdogar…\" — o'yladi Santyago, biroq fikrini yakunlashga ulgurmadi — kuchaygan \"lavanta shamoli\" shiddat bilan to'g'ri yuziga urildi.\n" +
                    "\n" +
                    "Shamol faqat bosqinchi mavrlar yelkanlarini ko'tarib qolmagan, balki o'zi bilan xavotirli sahro garmselini, chodralarga o'rangan ayollar bo'yini, bir zamonlar nimalarnidir qidirib, oltinu sarguzasht ishtiyoqida izg'iganlarning ter va umid-orzulari hidini ham olib kelgan. Shamol ehromlar nafasini ham olib kelgan. Bo'zbolaning erkin, daydi shamolga havasi keldi va o'zi ham uningday bo'la olishini his etdi. O'zidan boshqa hech kim yo'lini to'sa olmaydi. Qo'ylar, movutchining qizi-yu Andalusiyaning yaylovlari — bular bari o'z Yo'lini topguncha bosib o'tiladigan so'qmoqlar, xolos.\n" +
                    "\n" +
                    "Ertasi kuni choshgohda u bozor maydonida paydo bo'ldi va o'zi bilan oltita qo'yni haydab keldi.\n" +
                    "\n" +
                    "— G'alati ish bo'ldi, — dedi u qariyaga. — Do'stim hech qanday gap-so'zsiz mendan butun bir otarni sotib oldi va umr bo'yi cho'pon bo'lishni orzu qilgandim, dedi. Yaxshilik alomati bu.\n" +
                    "\n" +
                    "— Hamisha shunday bo'ladi, — javob qildi qariya. — Buni Xayrli Ibtido deyishadi. Agarda sen, misol uchun, hayotingda birinchi marta qarta o'ynashga o'tirsang, aftidan, yutgan bo'larding. Boshlovchilarning omadi keladi.\n" +
                    "\n" +
                    "— Nega bunday bo'ladi?\n" +
                    "\n" +
                    "— Chunki hayot sening o'z Taqdiring yo'lidan borishingni xohlaydi va omadlarni yor etib, ishtahangni ochadi.\n" +
                    "\n" +
                    "Shundan so'ng qariya qo'ylarni kuzata boshladi va bittasi oqsoqlanayotganini aytdi. Bo'zbola buning ahamiyati yo'qligini, suruvdagi eng aqlli, boz ustiga, eng ko'p jun beradigan shu qo'y, deya tushuntirdi.\n" +
                    "\n" +
                    "— Xo'sh, endi, xazinani qaerdan izlash kerak? — so'radi u.\n" +
                    "\n" +
                    "— Misrdan, ehromning yonidan.\n" +
                    "\n" +
                    "Santyago esankiradi. Lo'li kampir ham xuddi shu gapni aytgandi, faqat buning uchun undan hech nima olmadi.\n" +
                    "\n" +
                    "— Tangri har bir odamning bu dunyodagi yo'lini belgilab qo'yadi, sen u yoqqa ana shu belgilar orqali yo'l topasan. Faqat sen belgilarni — nimalar yozib qo'yilganini o'qiy bilsang bas.\n" +
                    "\n" +
                    "Santyago javob qilib ulgurmadi, u bilan qariya o'rtasida bir kapalak pirillab aylanaverdi. U bolaligida bobosidan go'yo kapalak omad keltirishi haqida eshitganini esladi. Xuddi qora chigirtka, kaltakesak va yo'ng'ichqaning bargchalariday.\n" +
                    "\n" +
                    "— Aynan shunday, — ming'irladi qariya uning xayolidan o'tgan fikrni uqib. — Hammasi xuddi bobong senga aytganiday. Bu o'sha belgilar, ularga amal qilsang, yo'lingni yo'qotmaysan.\n" +
                    "\n" +
                    "Shu so'zlarni ayta turib, u to'shini yalang ochdi va hayratga tushgan Santyago kecha ko'zini qamashtirgan yarqiroq jilvani esladi. Qariya oltindan quyulgan, qimatbaho toshlar bilan bezalgan sipar taqib yurardi. Aslida ham u podshoh edi, yupinroq kiyinib yurishining sababi esa, aftidan, talonchilar tashlanib qolmasligi uchun bo'lsa kerak.\n" +
                    "\n" +
                    "— Mana, ol, — dedi qariya va sipardan ikkita, oq va qora toshni ko'chirib, ularni Santyagoga uzatdi. — Bular Urim va Tummim deyiladi. Oqi \"ha\"ni, qorasi esa \"yo'q\"ni anglatadi. Belgilarning ma'nosini uqolmay qolganingda ular senga asqotadi. So'rasang — javob beradi. Biroq yaxshisi, — davom etdi u, — har qanday holatda o'zing bir qarorga kelganing ma'qul. O'zing bilasan, xazina — ehrom yonida, oltita qo'yni men senga bir qarorga kelishingga ko'maklashganim uchun olaman.\n" +
                    "\n" +
                    "Bo'zbola toshlarni to'rvasiga bekitdi. Endi, bundan keyin biror qaror qabul qilguday bo'lsa faqat o'ziga tayanadi, xolos.\n" +
                    "\n" +
                    "— Unutma, dunyodagi hamma narsa bir butun, yaxlit. Alomatlar tilini yodingdan chiqarma. Va, eng muhimi, shuni yodingdan chiqarmaginki,sen oxirigacha o'z Taqdiring yo'lidan ketishing kerak. Endi men senga muxtasar bir rivoyatni aytib beraman.\n" +
                    "\n" +
                    "Bir savdogar o'g'lini baxt nima, uning qanday sir-asrorlari bor, bilsin deb eng mash-hur donishmand huzuriga yuboribdi. O'g'lon qirq kecha-kunduz sahro kezib, nihoyat tog' tepasidagi ajoyib bir qal'ani ko'ribdi. Bu qal'ada u izlab yurgan Donishmand yasharkan.\n" +
                    "\n" +
                    "Kutilganidek, qal'a donishmandning uzlatga chekingan kimsasiz kulbasiga sira ham o'xshamas, aksincha, odam bilan to'la edi: savdogarlar lash-lushlarini ko'rsatib u yoq bu yoqqa chopqilashar, ba'zilari burchak-burchaklarda gaplashib turishar, mo''jazgina sozandalar guruhi mayin kuy ijro etar, zalning o'rtasida, bu o'lkada topsa bo'ladigan jamiki noz-ne'matlarga to'la to'kin dasturxon tortilgan.\n" +
                    "\n" +
                    "Donishmand bamaylixotir mehmonlar bilan bir-bir ko'rishib-so'rashib chiqadi va yigitchaning navbati yetguncha rosa ikki soat kutishiga to'g'ri keladi.\n" +
                    "\n" +
                    "Nihoyat Donishmand uning tashrifidan ko'zlagan maqsadini eshitadi, biroq baxt nimaligiyu, uning qanday sir-asrorlari borligini hozir tushuntirib o'tirishga vaqti yo'qligini aytadi. Yigitchaga qal'ani tomosha qilib, aylanib chiqqin, ikki soatdan keyin shu joyga kelasan, deb tayinlaydi.\n" +
                    "\n" +
                    "\"Darvoqe,sendan yana bir so'rovim bor, — deydi u yigitchaga ikki tomchi moy solingan choyqoshiqni uzatib. — Bu qoshiqchani olgin, qara, tag'in moy to'kilmasin\".\n" +
                    "\n" +
                    "Yigitcha, ko'zini qoshiqchadan uzmay, zinalardan chiqib-tushib saroyni aylanadi, ikki soatdan so'ng yana Donishmand qoshida hozir bo'ladi.\n" +
                    "\n" +
                    "\"Xo'sh, — deydi Donishmand, — oshxona zalidagi forsiy gilamlar senga yoqdimi? Bog'dagi dov-daraxtlar, gulzorlar-chi? Ularni qo'li gul bog'bonlar o'n yil deganda barpo etishgan. Mening kutubxonamdagi eski qalin kitoblar, teriga bitilgan qo'lyozmalar-chi?\"\n" +
                    "\n" +
                    "O'sal bo'lgan yigitcha bularni ko'rmaganini tan oladi, zotan, qal'ani aylanganda u butun diqqatini xo'jayin qo'liga ishonib topshirgan choyqoshiqdagi moydan uzmagan edi.\n" +
                    "\n" +
                    "\"Izingga qayt va mening uyimdagi mo''jizalarni tomosha qil, — dedi shunda Donishmand. — Turish-turmushini ko'rib bilmagan odamingga qanday ishonasan\".\n" +
                    "\n" +
                    "Yigitcha qo'lida qoshiq bilan yana saroyni aylangani jiladi. Bu safar u oldingiday diqqat bo'lmay, xonalarni bezab turgan kamyob jihozlarni, san'at asarlarini ko'rib chiqadi. U bog'larni va qal'ani o'rab turgan qoyalarni kuzatadi, gullarning va suratu haykallarning go'zalligini o'zicha baholaydi. Donishmandning oldiga qaytgach, u ko'rganlarining hammasini oqizmay-tomizmay aytib beradi.\n" +
                    "\n" +
                    "\"Ikki tomchi moy qani, men senga to'kib qo'yma deb taylagandim?\"— so'raydi Donishmand.\n" +
                    "\n" +
                    "Shunda yigitcha qoshiqchadagi moyning to'kilganini payqaydi.\n" +
                    "\n" +
                    "\"Mana shu men senga beradigan birdan-bir maslahat, — deydi unga donolar donosi. — Baxtning siru asrori dunyoning bor jozibasiyu tarovatini ko'ra bilishda va ayni paytda choyqoshiqdagi ikki tomchi moyni ham hech qachon yoddan chiqarmaslikda\".\n" +
                    "\n" +
                    "Santyago rivoyatni eshitib uzoq jim qoldi. U qariyaning nima demoqchi bo'lganini tushundi. Cho'pon dashtu dala kezishni yaxshi ko'radi, biroq qo'y-qo'zisini hech qachon unutmaydi.\n" +
                    "\n" +
                    "Santyagoga qadalib qarab, podshoh Malkisidiq qo'llarini tutashtirdi va g'alati harakat bilan bo'zbolaning boshi ustidan sermadi. Keyin esa, qo'ylarni oldiga solib, o'z yo'liga ravona bo'ldi.\n" +
                    "\n" +
                    "Mo''jazgina Tarif shaharchasi ustida, bir zamonlar mavrlar qurgan, eski qal'a qad rostlab turibdi. Agar minoraga chiqib qaralsa, makkabodroq sotuvchisining qutisi turgan maydon kaftdagiday ko'rinadi. Bu joydan Afrika qirg'oqlarining uzunchoq parchalari ham ko'zga tashlanadi. O'sha kuni qal'a devorida, yuzini mashriqdan esayotgan shamolga tutib, Malkisidq — Salim podshohi o'tirgan edi. Taqdirlarida kechgan alg'ov-dalg'ov o'zgarishlardan bezovtalanayotgan qo'ylar yangi xo'jayinidan nariroqda qo'shoqlanganday g'uj bo'lib turardi. Ularni hali ham qiziqtirib turgan eng muhim narsa yemish edi.\n" +
                    "\n" +
                    "Bandargohga kiriladigan joyda turgan chog'roq kemaga qarab o'tirgan Malkisidq, bir paytlar unga ushr berganidan so'ng Ibrohimni qayta uchratmaganiday, endi bu bo'zbolani ham boshqa ko'rmasligi haqida o'ylardi.\n" +
                    "\n" +
                    "Umrboqiylarda orzu-istak bo'lmasligi kerak, chunki bu yerda ularning o'z yo'llari yo'q. Biroq baribir Malkisidq qalbining tubida Santyago degan mana shu bolaga omad yor bo'lishini tilardi.\n" +
                    "\n" +
                    "\"Uning hoziroq hatto mening ismimni ham unutib yuborishi achinarli-da, — o'yladi u. — Mening ismimni takrorlab turishi kerak edi. Alhol, meni eslab, \"Malkisidq, Salim podshohi\" degan sirli qariyani tilga olsa.\"\n" +
                    "\n" +
                    "U ko'zini samoga tikdi va biroz iymanib, dedi:\n" +
                    "\n" +
                    "— Tangrim, iqrorman, bular barchasi, Sening kalomingda zikr etilganiday, \"behudadan behuda urinish.\" Lekin gohida qari podshoh ham o'zi bilan g'ururlanadi-da.\n" +
                    "\n" +
                    "\"Afrika deganlari g'alati joy ekan\", — o'yladi Santyago.\n" +
                    "\n" +
                    "U shaharning tang ko'chalarida tez-tez duch keladigan torgina yemakxonada o'tirardi. Bir necha kishi kattakon chilimni qo'lma-qo'l almashib chekishardi. Shu orada u qo'l ushlashib borishayotgan erkaklarni, yuzini bekitgan ayollarni, baland minoralarga chiqib olib, qiroat bilan bir nimalarni aytib qichqirayotgan ruhoniylarni ko'rdi, ayni damda atrofdagilar tiz cho'kishar va manglaylarini yerga tekizishardi.\n" +
                    "\n" +
                    "\"Ko'chmanchi musulmonlarning makoni. Ularning urf-odatlari ham shu yerda ildiz otgan\", — dedi ichida u.\n" +
                    "\n" +
                    "U bolaligida qishloqlaridagi cherkovda avliyo Yoqubning suratini ko'rgandi — mavrlarni mahv etgan g'olib oq ot ustida, qo'lida qilichni baland ko'targan holda tasvirlangan, uning poyida hozir yemakxonada Santyago bilan yonma-yon o'tirishgan kishilarga o'xshash so'xtasi sovuq odamlar mukka tushgan. Bo'zbola sarosimalandi — u o'zini juda yolg'iz his etdi.\n" +
                    "\n" +
                    "Boz ustiga, safarga chiqishdan oldin u bir narsani xayoldan faromush qilgan ediki, ayni shu narsa uning xazinaga boradigan yo'lida uzoq vaqt to'siq bo'lishi mumkin edi. Zotan, bu mamlakatda hamma arabcha gaplashardi.\n" +
                    "\n" +
                    "Yemakxona xo'jayini uning oldiga keldi va Santyago imo-ishoralar bilan yonidagi stolda o'tirganlar ichayotgan ichimlikdan unga ham olib kelishini so'radi. Bu achchiq choy ekan. Bo'zbola vinoni xush ko'rardi.\n" +
                    "\n" +
                    "Sirasini aytganda, buning ahamiyati yo'q — faqat xazina va ungacha qanday yetib borish haqida bosh qotirishi kerak. Sotgan qo'ylaridan tushgan pul anchagina, ular hamyonida, o'zining kuchini ko'rsatsa, harqalay, kishi yolg'izlik azobidan unchalik ozor chekmaydi. Tez-orada, atigi bir necha kundan keyin, u ehromlarga yetib boradi. Sof oltindan yasalgan ko'kraksiparli qariya besh-oltita qo'yini olib, boyib qolish uchun uni anoyi qilmagandir.\n" +
                    "\n" +
                    "Qariya unga belgilar haqida gapirdi va Santyago, bo'g'ozdan suzib o'tgunicha, faqat shular haqida o'yladi. Gap nimadaligini u tushundi: Andasuliyada sang'ib yurib, yerdagi va osmondagi belgilarga qarab o'zini oldinda nimalar kutayotganini bilib olishga urindi. Chumchuq ilonning bekinib turgan joyidan xabar yetkazishi mumkin; buta shu atrofda jilg'a yoki daryo borligidan darak beradi. Bularning bariga uni qo'ylar o'rgatdi.\n" +
                    "\n" +
                    "\"Agar ularni Tangri yo'llab turgan bo'lsa, U menga ham yo'ldan chalg'ishimga monelik qilmaydi\", — o'yladi Santyago va biroz xotirjam bo'ldi. Shunda hatto choy ham unchalik taxir tuyulmadi.\n" +
                    "\n" +
                    "— Sen kim bo'lasan? — tuyqusdan ispancha so'z eshitildi.\n" +
                    "\n" +
                    "Santyago beixtiyor yengil tortdi: u belgilar haqida o'ylayotgandi va mana, belgi berildi. Unga ovoz bergan taxminan uning tengquri, yevropacha kiyingan bo'lib, faqat terisining rangi shu yerlik ekanini bildirardi.\n" +
                    "\n" +
                    "— Sen ispanchani qayoqdan bilasan? — so'radi Santyago.\n" +
                    "\n" +
                    "— Bu yerda uni qariyb hamma biladi. Ispaniya ikki soatlik yo'l.\n" +
                    "\n" +
                    "— Kel, o'tir, men seni biror narsa bilan mehmon qilay. O'zingga ham, menga ham vino buyur. Choyga uncha tobim yo'q.\n" +
                    "\n" +
                    "— Bu mamlakatda vino ichishmaydi, — javob qildi u. — Vino ta'qiqlanadi.\n" +
                    "\n" +
                    "Shunda Santyago ehromlargacha yetib borishi zarurligini aytdi. Xazina haqidagi gap og'zidan chiqib ketishiga bir bahya qoldi, biroq vaqtida tilini tishladi: aytib bo'ladimi, bu arab unga yordam berishi evaziga xazinaning bir qismini talab qilishi mumkin-ku. Bo'zbola qariyaning gaplarini esladi: qo'lingda, o'zingniki bo'lmagan narsani va'da qila ko'rma.\n" +
                    "\n" +
                    "— Meni ehromlargacha olib borolmaysanmi? Buning uchun men senga haqini to'lardim.\n" +
                    "\n" +
                    "— Sen tasavvur qila olasanmi o'zi, uning qaerdaligini?\n" +
                    "\n" +
                    "Santyago yemakxona xo'jayini ularning yaqiniga kelib, gurungni jon qulog'i bilan eshitayotganini payqadi. Garchi uning oldida gapirgisi kelmayotgan bo'lsa-da, bo'zbola omadi chopib uchratgan yo'l boshlovchini qo'ldan chiqargisi kelmasdi.\n" +
                    "\n" +
                    "— Butun Sahroni kesib o'tishingga to'g'ri keladi, — dedi u. — Buning uchun pul kerak. Puling bormi?\n" +
                    "\n" +
                    "Bu savoldan Santyago hayron bo'ldi. Biroq u qariyaning gapini esladi: agar sen biror narsani xohlasang, butun Olam sening xohishing ijobat bo'lishiga ko'maklashadi. Va u cho'ntagidan pulni olib, arabga ko'rsatdi. Xo'jayin ularga yanada yaqinroq kelib, tepalarida turib oldi, keyin esa haligi bola bilan arabchada qattiq-qattiq gaplashdi. Santyagoning nazarida xo'jayin nimagadir achchiq qilayotganday edi.\n" +
                    "\n" +
                    "— Ketdik bu yerdan, — dedi bola. — Bizning bu yerda o'tirishimiz unga yoqmayapti.\n" +
                    "\n" +
                    "Santyago xursand bo'lib o'rnidan turdi va hisob-kitob qilay degandi, xo'jayin uning qo'lidan tutib, nimalardir deb gapira boshladi. Qo'lini bo'shatib olishga Santyagoning qurbi yetardi, biroq u yot bir mamlakatda va boz ustiga, bunday vaziyatda o'zini qanday tutish lozimligini bilmas edi. Baxtiga yangi tanishi xo'jayinni ko'kragidan itarib yubordi va Santyagoni yemakxonadan ko'chaga olib chiqib ketdi.\n" +
                    "\n" +
                    "— U sening pullaringni olmoqchi bo'ldi. Tanjer Afrikaning boshqa shaharlariga o'xshamaydi. Bu bandargoh, bandargoh esa doim tovlamachilarga to'lib yotadi.\n" +
                    "\n" +
                    "Unga ishonsa bo'ladi. U mushkul vaziyatga yordam berdi. Santyago yana cho'ntagidan pullarni olib, sanadi.\n" +
                    "\n" +
                    "— Ertagayoq ehromlarga jo'nashimiz mumkin, — dedi arab. — Biroq avval ikkita tuya sotib olishimiz kerak.\n" +
                    "\n" +
                    "Shunday deb u Santyagoning qo'lidan hamyonni oldi.\n" +
                    "\n" +
                    "Ular Tanjerning har qadamda chodirlaru savdo qutilari turgan tor ko'chalaridan yurib ketishdi va minglab olomon bilan to'la bozor maydonidan chiqishdi — odamlar savdolashar, baqirib-chaqirishardi. Ko'katu mevalar pichoq, xanjarlar bilan bir joyga uyub tashlangan, gilamlar esa turli-tuman chilimlar yonida. Santyago hamrohidan ko'zini uzmay borardi — bo'zbola bor pulini sherigiga bergan edi. U pulni qaytarib olmoqchi ham bo'ldi, biroq bu noqulay, degan o'yga bordi. Bu mamlakatning urf-odatlari Santyagoga notanish edi. \"Hechqisi yo'q, — o'yladi u, — men uni sergaklik bilan kuzatib borayapman, shuning o'zi yetarli, axir, men undan qoruvliman.\"\n" +
                    "\n" +
                    "U tasodifan turli-tuman buyumlar orasida qilichni ko'rib qoldi, bunaqa chiroyli qilichni hech qachon ko'rmagan edi: g'ilofi misdan, dastasi qimmatbaho toshlar va sir bilan bezalgan. Santyago Misrdan qaytishda, albatta, o'ziga shunday qilich sotib olishni ko'ngliga tugdi.\n" +
                    "\n" +
                    "— So'ra-chi, narxi qancha ekan? — turgan joyidan burilmay so'radi u yo'ldoshidan.\n" +
                    "\n" +
                    "Shu lahzada u qilichga mahliyo bo'lib, ikki daqiqaga chalg'iganini payqadi. Yuragi shuvillab ketdi. U o'grilib qarashga cho'chidi, chunki qarasa ko'z oldida qanday manzara namoyon bo'lishini bildi. Yana bir necha lahza u qilichdan ko'zini uzmay turdi, keyin o'zini qo'lga olib, boshini burdi.\n" +
                    "\n" +
                    "Atrof g'ala-g'ovur, bozor qaynab-toshardi, odamlar zir yugurar, baqirib-chaqirardi, gilamlar va yong'oqlar, mis laganlar va ko'katlar uyulib qorishib yotar, erkaklar qo'l ushlashib, ayollar paranjida yurishar, allaqanday taomlarning hidlari taralar va faqat uning boyagi yo'ldoshi qay go'rgadir g'oyib bo'lgandi.\n" +
                    "\n" +
                    "Avvaliga Santyago ular bir-birini olomon orasida tasodifan yo'qotib qo'yishganiga o'zini ishontirishga urindi va turgan joyidan jilmay kutishga qaror qildi — lop etib kelib qolar, deb o'yladi. Biroz vaqt o'tdi; baland minoraga ko'tarilgan kishi qiroat bilan nimadir deb qichqirdi — shu lahza atrofdagilar muk tushib, manglaylarini yerga tegizishdi va xirgoyi qila boshlashdi. Keyin esa, xuddi tinib-tinchimas chumolilarday g'imirlashib, narsalarini yig'ishtirishdi, chodir va savdo qutilarini bekitishdi. Bozor bo'shab qoldi.\n" +
                    "\n" +
                    "Quyosh ham osmonni tark eta boshladi; Santyago uni uzoq kuzatdi — quyosh maydonni qo'rg'alagan oq uylarning tomlari ortiga bekinguncha termilib turdi. U esladi, bugun quyosh ko'tarilgan paytda u narigi qit'ada edi, cho'pon edi, oltmishta qo'yi bor edi va movutchining qizi bilan uchrashuvni kutardi. Erta tongdayoq, otarini yaylovga haydagandan so'ng, nimalar ro'y berishi unga oldindan ayon bo'lgandi.\n" +
                    "\n" +
                    "Mana, shu kunning shom pallasida u boshqa bir mamlakatda yuribdi, yot o'lkada u begona va hatto mahalliy xalq gaplashadigan tilni ham bilmaydi. Endi u cho'pon emas, bor-yo'g'idan, avvalo, pulidan ajralib qoldi, demak, endi ortga qaytolmaydi va hammasini boshidan boshlay olmaydi.\n" +
                    "\n" +
                    "\"Bularning bari quyosh chiqib botguncha ro'y berdi-ya\", — o'yladi bo'zbola. U o'z ahvoliga achindi va hayoti kutilmaganda butkul o'zgarib ketganiga qattiq qayg'urdi.\n" +
                    "\n" +
                    "Yig'lay desa uyat. U hatto qo'ylarining oldida yig'lashga ham uyalardi. Biroq bozor maydoni allaqachon bo'shab qolgan, u esa yolg'iz, vatanidan juda uzoqda.\n" +
                    "\n" +
                    "Santyago yig'lab yubordi. Nahotki, Tangrining qahri, bor yo'g'i ko'rgan tushiga ishongan kishilar uchun, shu qadar qattiq bo'lsa!\n" +
                    "\n" +
                    "\"Qo'ylarimni boqib yurganimda mendan baxtiyor odam yo'q edi, men hammaga xursandchilik ulashardim. Meni ko'rganda odamlar shod bo'lishardi va eng e'tiborli mehmonday e'zozlashardi.\n" +
                    "\n" +
                    "Mana, endi men g'amga botdim va baxtsizman. Nima qilarimni bilmayman. Endi badjahl va hech kimga ishonmaydigan bo'laman, bir odam meni aldab ketgani uchun hammadan gumonsirab yashayman. Xazina topganlarni esa ko'rolmayman, negaki bu omad mendan yuz o'girdi. Xasga tirmashib yashayman endi, chunki qurbim shunga yetadi, xolos, olamni anglamoqqa ojiz va kuchsizman\".\n" +
                    "\n" +
                    "U to'rvasini ochib, uning ichida biror-bir yegulik — hech bo'lmasa yog' bilan bir burda non — qolmaganmikan, deb qaradi, biroq to'rvadan qalin kitob, kamzul va qariya bergan ikki dona toshni topdi, xolos.\n" +
                    "\n" +
                    "Ularga ko'zi tushib, Santyagoning chiroyi ochildi. Axir, u qariya sovg'a qilgan shu ikkita toshga oltita qo'yni almashdi-da. Agar bu toshlarni sotolsa bo'lgani — puliga patta olib vataniga qaytadi.\n" +
                    "\n" +
                    "\"Endi aqlimni yig'ib ish qilaman\", — o'yladi u to'rvadan toshlarni olib, cho'ntagiga bekitarkan. Bu yer bandargoh shahar, bandargoh esa, uni shilib ketgan haligi yulg'ich to'g'ri aytganiday, tovlamachilarga to'la.\n" +
                    "\n" +
                    "Faqat endigina yemakxona xo'jayinining nima uchun qizishib gapirganiga Santyagoning aqli yetdi — u bo'zbolaga qavatingdagi yo'ldoshiga ishonma, deya jon kuydirib uqtirgan ekan.\n" +
                    "\n" +
                    "\"Men xuddi boshqa oddiy odamlardayman: xayolimdagini borga yo'yaman va dunyoni asli qanday bo'lsa shundayligicha emas, balki o'zim xohlaganday ko'raman\".\n" +
                    "\n" +
                    "U yana toshlarni qo'liga olib qaradi, mehr bilan siladi — toshlar iliq tuyuldi. Mana, hozircha uning qo'lidagi haqiqiy xazina shu. Qo'lingni tekizsang ko'ngling ko'tariladi. Ular Santyagoga qariyani eslatdi. Qariyaning gaplari uning qalbida qayta sado berganday bo'ldi: \"Agar sen biror narsani xohlasang, butun Olam sening xohishing ijobat bo'lishiga ko'maklashadi\".\n" +
                    "\n" +
                    "Uning bilgisi keldi — to'g'rimikan bu gap. U bo'm-bo'sh bozor maydonining qoq o'rtasida turibdi, cho'ntagida bir miri yo'q va endi qo'ylarni bu oqshom qaerga qamab qo'ysam, deb bosh qotirishi ham shart emas. Biroq cho'ntagidagi qimmatbaho toshlar uning yaqinda podshoh bilan uchrashganini shak-shubhasiz dalillab turar, podshoh uning butun hayotini: otasining miltig'ini so'ramay olganiyu, birinchi marta ayol bilan bo'lganini — hammasini bilar edi.\n" +
                    "\n" +
                    "\"Toshlar senga jumboqni yechishga yordam beradi. Ular Urim va Tumim deyiladi\", — esladi u.\n" +
                    "\n" +
                    "Santyago ularni yana cho'ntagidan chiqardi va to'rvasiga soldi, keyin sinab ko'rgisi keldi. Qariya toshlarga savollarni aniq qilib berish kerak, deb tayinlagan edi, chunki ular nimani xohlayotganini aniq biladigan kishiga yordam beradi, degandi. U toshlardan: qariyaning menga bildirgan tilaklari hali o'z ta'sirini yo'qotgani yo'qmi, deb so'radi va qo'lini to'rvadan chiqardi:\n" +
                    "\n" +
                    "— Yo'q, — javob qildi tosh.\n" +
                    "\n" +
                    "— Men xazinani topa olamanmi? — so'radi Santyago.\n" +
                    "\n" +
                    "U yana to'rvaga qo'lini tiqdi va toshlarni aralashtirib javobni olaman deganida ikkala tosh ham to'rvaning teshigidan tushib ketdi. Negadir u oldinlari to'rvaning eskirib qolganini sezmagandi. Santyago toshlarni yerdan terib olib, ularni tag'in yashirish uchun egilgan chog'da miyasiga bir yangi fikr keldi: \"Belgilarga e'tibor bilan qarashga va ularga ergashishga o'rgan\", — degandi qariya.\n" +
                    "\n" +
                    "Belgi! Santyago kulib yubordi. Keyin darhol yerdan toshni olib, to'rvasiga tiqdi. U to'rvaning teshigini tikishni xayoliga ham keltirmaydi, chunki xohlagan damda toshlar to'rvani tark etishi mumkin. U tushundi, dunyoda shunday narsalar borki, ular haqida so'rab-surishtirish befoyda — bu o'z taqdiringdan qochib qutila olmasligingga o'xshaydi. \"Axir, men qariyaga faqat o'zim qaror qabul qilaman, deb va'da berganman-ku\", — dedi u ichida.\n" +
                    "\n" +
                    "Biroq toshlar unga qariyaning hali ham u bilan birga ekanidan ishora berdi va bu bo'zbolada ishonch uyg'otdi. U yana bo'm-bo'sh maydonga ko'z yugurtirdi, biroq endi uning nigohi oldingiday umidsiz emas edi. U yot bir dunyoga kelib qolmagan, shunchaki yangi bir joyda edi.\n" +
                    "\n" +
                    "Axir, unga ayni shu — yangi joylarni ko'rish yoqardi-da. Agar ehromlargacha yetib borish nasib etmasa-da, achinmaydi, chunki u har qanday cho'pondan ham ko'proq narsalarni ko'rdi, bildi.\n" +
                    "\n" +
                    "\"Ular bilsaydi, — o'yladi bo'zbola, — atigi ikki soatli yo'l narisida hammasi mutlaqo boshqacha ekanini\".\n" +
                    "\n" +
                    "Yangi dunyo hozir uning ko'z o'ngida o'lik maydonga aylanib yotardi, biroq haligina bu joyda hayotning qaynab-toshganini ko'rishga u ulgurdi va endi buni hech qachon unutmaydi. U o'zi ko'rgan qilichni ham esladi: ha, ikki daqiqali tomosha uchun ko'p pulidan ajrab qolishiga to'g'ri keldi, biroq bunday narsani u avval hech qachon ko'rmagandi-da. Tuyqusdan Santyago dunyoga nafaqat tovlamachi va yaramas kimsaning qurboni bo'lgan odam ko'zi bilan, balki jasur xazina qidiruvchi va sarguzashtlar ishqibozining nigohi bilan ham qaray olishini anglab qoldi.\n" +
                    "\n" +
                    "— Men — jasur xazina qidiruvchi va sarguzashtlar ishqiboziman, — ming'irladi u uyquga ketarkan.\n" +
                    "\n" +
                    "Kimdir biqinidan turtganidan u uyg'onib ketdi. Santyago qoq o'rtasida tunagan bozor maydoni tong otishi bilan tag'in jonlana boshlagan edi.\n" +
                    "\n" +
                    "Odatiga ko'ra, qo'ylarni ko'rmoqchi bo'lib alanglarkan Santyagoning uyqusi butkul ochildi va o'zining yangi bir olamda ekani yodiga tushdi, esladi, biroq bundan ko'ngli cho'kmadi, aksincha, u baxtiyor edi. Endi qorin g'amida tentirab yurmaydi — to'g'ri xazinaga yo'l oladi! Garchi cho'ntagida bir miri bo'lmasayam, ertangi kuniga ishonchi bor, ko'ngli to'q. Kecha oqshom u sarguzashtlar ishqibozining taqdirini havas qildi, bunday qismatni o'ziga tanladi: endi u bir paytlar kitoblarda o'qigan qahramonlardan biriga aylanadi.\n" +
                    "\n" +
                    "Bo'zbola shoshilmasdan qadam tashlab, bozor maydonining chetidan yurdi. Savdogarlar chodirlarini ocha boshlashgandi, u shirinliklar sotadigan bir savdogarga peshtaxtaga narsalarini terishga ko'maklashdi.\n" +
                    "\n" +
                    "Savdogar xursand bo'lib kuldi; u o'z hayotidan mamnun, nima uchun yashayotganini bilar va yangi ish kunini xush kayfiyat bilan qarshilashga hozirlanayotgan edi. Uning kulgisi bo'zbolaga qariyani — sehrli podshoh Malkisidqni eslatdi.\n" +
                    "\n" +
                    "\"Bu savdogar dunyo kezish yoki movutchining qiziga uylanish uchun shirinlik pishirmaydi. Bu shunchaki uning ko'nglidagi mashg'uloti, shu ish unga yoqadi\", — deb o'yladi bo'zbola va bir qarashda har qanday odamning o'z taqdiri Yo'liga qanchalik uzoq yoki yaqinligini qariyadan yomonroq bilmasligini payqadi.\n" +
                    "\n" +
                    "\"Bu juda oddiy, nahotki men avval buni tushunmaganman?\"\n" +
                    "\n" +
                    "Chodirni tortib bog'lashgandan so'ng qandolatchi unga yog'da pishgan birinchi somsani uzatdi. Santyago uni bahuzur yedi va tashakkur bildirib, chodirdan jildi. Ketayotib tuyqusdan chodirni qurishayotganda qandolatchining arabcha gapirgani va o'zining ispancha javob qilgani yodiga tushdi, biroq ular baribir bir-birlarini tushunishibdi-da.\n" +
                    "\n" +
                    "\"Demak, so'zlarga tobe bo'lib qolmagan til ham bor ekan, — o'yladi u. — Men shu tilda qo'ylar bilan gaplashardim, mana, endi odam bilan gaplashishga urinib ko'rdim\".\n" +
                    "\n" +
                    "\"Hammasi bir butun, yaxlit\", degan edi Qariya.\n" +
                    "\n" +
                    "Santyago belgilarni ko'zdan qochirmaslik uchun Tanjerning tor ko'chalaridan shoshilmay yurishga qaror qildi. Bu sabr-qanoatni talab etadi, biroq sabr-qanoat shunday ezgu ne'matki, har qanday cho'pon dastlab ana shu saboqni oladi.\n" +
                    "\n" +
                    "\"Hammasi bir butun, yaxlit\", — Malkisidqning so'zlari tag'in yodiga tushdi.\n" +
                    "\n" +
                    "Billur buyumlar sotuvchi savdogar yangi kunning boshlanishini kuzata turib, ertalabdanoq ko'nglini cho'ktiradigan odatdagi g'am-tashvishdan og'rindi. U tik tushgan tor ko'chadagi xaridorlar onda-sonda bosh suqadigan do'konida, qariyb o'ttiz yildan beri, tirikchilik qiladi. Hayotida biror-bir o'zgarish qilishga endi kech; billur idishlarni sotishdan bo'lak yumush qo'lidan kelmaydi. Bir paytlar uning do'koni gavjum bo'lardi, arab savdogarlari, ingliz va frantsuz geologlari, olmon askarlari — puldor odamlar ko'p kelishardi. O'shanda billur savdosi foydaning koni edi va u boyib ketishiga, yoshi qaytganda malohatli ayollar ko'nglini charog'on etishga umidlanardi.\n" +
                    "\n" +
                    "Biroq zamon evrildi, bu bilan baqamti shahar ham o'zgarishlarga yuz burdi. Tanjerning shundoq biqinidagi Seut tez qad rostladi va savdoning avj nuqtasi o'sha tarafga ko'chdi. Yon-atrofidagi savdogar-qo'shnilar har qaysi har yoqqa ravona bo'lishdi, bu tor ko'chada sanoqligina do'konchalar qoldi va deyarli hech kim ularga bosh suqaydi, bu joyga qadam bosmaydi.\n" +
                    "\n" +
                    "Biroq har nima bo'lganda ham, billur idish sotuvchi bu savdogarning endi bo'lari bo'lib, bo'yog'i singgan edi. O'ttiz yil u billur olib sotish bilan mash-g'ul bo'ldi, endi yoshi bir joyga borganda hayotini o'zgartirishga kech.\n" +
                    "\n" +
                    "Choshgohgacha savdogar unda-bunda o'tganlarni kuzatib o'tirdi. Ko'p yillar shu zaylda o'tirganidan bu tang ko'chadan kimning qay mahalda o'tishi unga yod bo'lib ketgan. Biroq tushlikka bir necha daqiqa qolganda do'konining peshtaxtasi ortida bir navqiron muhojir paydo bo'ldi. U binoyiday kiyingan edi, biroq savdogar sinchkov nigohi bilan uning puli yo'qligini payqadi. Shunday bo'lsa-da, u chiqib ketgunicha tushlikka shoshilmay turishni ma'qul bildi.\n" +
                    "\n" +
                    "Eshikdagi e'lon bu do'konda xorijiy tillarda ham gapirilishini daraklardi. Santyagoning ko'zi peshtaxta ortida ko'ringan xo'jayinga tushdi.\n" +
                    "\n" +
                    "— Xohlasangiz, men mana bu idishlaringizni yuvib beraman, — dedi bo'zbola. — Bu ahvolda ularni hech kim sotib olmaydi.\n" +
                    "\n" +
                    "Xo'jayin javob qilmadi.\n" +
                    "\n" +
                    "— Evaziga menga biror yegulik berasiz.\n" +
                    "\n" +
                    "Xo'jayin miq etmay unga qarab turardi. Santyago bir qarorga kelishi zarurligini tushundi. To'rvasida kamzuli bor edi — sahroda keragi bo'lmaydi. U kamzulni to'rvadan olib, idishlarni artishga kirishdi. Yarim soat ichida peshtaxtadagi idishlar yaraqladi va shu payt ikki kishi kirib, billur idishlardan xarid qildi.\n" +
                    "\n" +
                    "Ishni tugatib, Santyago xo'jayindan ovqat so'radi.\n" +
                    "\n" +
                    "— Yurchi men bilan, — dedi unga javoban xo'jayin.\n" +
                    "\n" +
                    "Eshikka \"Tushlik payti\" deb yozilgan lavhachani ilib, u Santyagoni tor ko'chaning baland joyidagi yemakxonaga olib bordi. Ular bu yerdagi yagona stol-ga kelib o'tirishdi.\n" +
                    "\n" +
                    "Billur sotuvchi kuldi:\n" +
                    "\n" +
                    "— Idishlarni tozalashingga hojat yo'q edi. Qur'onda och odamning qornini to'ydirish buyurilgan.\n" +
                    "\n" +
                    "— Nega siz meni to'xtatmadingiz?\n" +
                    "\n" +
                    "— Chunki idishlar kir edi. Qolaversa, ikkalamiz ham miyamizni keraksiz lash-lushlardan tozalashimiz zarur-ku.\n" +
                    "\n" +
                    "Ovqatlanib bo'lishgach, savdogar dedi:\n" +
                    "\n" +
                    "— Sen mening do'konimda ishlasang deyman. Bugun, sen idishlarni artib tozalayotganingda ikkita xaridor keldi — bu xayrli alomat.\n" +
                    "\n" +
                    "\"Odamlardan belgi-alomatlar haqida tez-tez eshitasan, — o'yladi cho'pon bola, — biroq ular o'zlari aytishayotgan gaplarining fahmiga borishmaydi. O'zim-chi, o'zim ham, ma'nisiga bormay necha yil qo'ylarim bilan so'zsiz tilda gaplashib yurdim-ku\".\n" +
                    "\n" +
                    "— Xo'sh, nima deysan — tiqilinch qildi savdogar. — Mening do'konimda ishlaysanmi?\n" +
                    "\n" +
                    "— Tong otguncha hamma idishlarni yuvib tozalayman, — javob qildi bo'zbola. — Haqiga menga Misrga yetib olishimga yetarli pul berasiz.\n" +
                    "\n" +
                    "Savdogar chol yana kulib yubordi.\n" +
                    "\n" +
                    "— Mening do'konimda yil bo'yi billur idishlarni yuvib, buning ustiga har bir sotilgan idish pulidan yaxshigina foiz olib tursang ham Misrgacha yetadigan pul topolmaysan, baribir qarz ko'tarishingga to'g'ri keladi. Tanjer bilan Misr orasi — minglab kilometr sahro.\n" +
                    "\n" +
                    "Bir daqiqa og'ir jimlik cho'kdi, go'yo butun shahar uyquga cho'mganday bo'ldi. Bozorlar, o'z molini maqtab yotgan savdogarlar, minoraga chiqib azon aytayotgan kishilaru, dastasi hashamli qilichlar — bari g'oyib bo'ldi. Umid va sarguzashtlar ishtiyoqi, keksa podshoh va Taqdir Yo'li, xazina va ehromlar o'z-o'zidan yo'qoldi-yitdi. Dunyoni o'lik sukunat o'z zabtiga oldi. Chunki Santyagoning ruhi tamom cho'kib ketgan edi. U na og'riqni, na azobni va na afsus-nadomatni his etar, nigohi yemakxonaning ochiq eshigiga qarab qotib qolgan va faqat juda-juda o'lgisi kelar, hammasi hozirning o'zidayoq butkul yo'q bo'lishini istardi.\n" +
                    "\n" +
                    "Savdogar unga qarab qoshini kerdi — ertalab, haligina bu bola quvnoq ko'ringan edi. Endi qovog'idan qor yog'ayapti: quvnoqligidan asar ham qolmadi.\n" +
                    "\n" +
                    "— Men senga, o'g'lim, vataning-ga borib olishing uchun yetadigan pul bera olaman, — dedi savdogar.\n" +
                    "\n" +
                    "Bo'zbola indamadi. Keyin o'rnidan turdi, kiyimlarini tortib to'g'riladi va to'rvasini qo'liga oldi.\n" +
                    "\n" +
                    "— Men do'koningizda qolib ishlayman, — dedi u.\n" +
                    "\n" +
                    "Va biroz sukut saqlab, qo'shib qo'ydi:\n" +
                    "\n" +
                    "— Menga pul kerak, to'rt-beshta qo'y sotib olishim uchun.");

            JSONObject content3=new JSONObject();
            content3.put("title","IKKINCHI QISM");
            content3.put("text","Santyago qariyb bir oy do'konda ishladi, biroq yangi ish ayni uning ko'nglidagiday edi, deb bo'lmasdi. Billur buyumlar sotuvchi savdogar kun bo'yi do'kon peshtaxtasi ortida o'tirar va bo'zbolaga idishlarga ehtiyot bo'lishini tayinlab tinimsiz to'ng'illardi.\n" +
                    "\n" +
                    "Shunga qaramay ishdan bo'shab ketishga majbur bo'lgani yo'q, chunki Savdogar, vaysaqiligiga qaramay, halol va va'dasida turadigan kishi edi: Santyago har bir sotilgan idishdan shirinkoma olar va hatto ozgina pul ham jamg'argandi. Bir kuni ertalab u topgan-tutganini sanab chamaladi, agar hozirgiday ishlab tursa, bir yildan keyingina to'rt-beshta qo'y sotib olishga qurbi yetar ekan.\n" +
                    "\n" +
                    "— Peshtaxtani tashqariga chiqarib, idishlarni shunga terib qo'ysak yaxshi bo'ladi, — dedi u xo'jayinga. — Uni do'konning eshigi oldiga qo'yardik, o'tgan-ketganning ko'zi tushadi.\n" +
                    "\n" +
                    "— Shu paytgacha idishlarni ko'chaga olib chiqqanimiz yo'q, — javob qildi Savdogar. — Birortasi turtib yuborib billurni sindirishi mumkin.\n" +
                    "\n" +
                    "— Qo'y boqib yurganimda ulardan birortasini ilon chaqib nobud qilishi mumkin edi. Biroq, nachora, qo'ylarning, cho'ponlarning ham hayoti shunaqa.\n" +
                    "\n" +
                    "Bu payt Savdogar uchta qadah sotib olayotgan xaridorga xizmat ko'rsatayotgan edi. Xullas, savdo jonlangan, go'yo bir paytlari bo'lgani kabi, do'kon joylashgan bu tor ko'cha tag'in butun shahardan odamlarni o'ziga ohanraboday torta boshlagandi.\n" +
                    "\n" +
                    "— Ishlar yomonmas, — dedi u xaridor chiqib ketgach. — Hozir men yaxshi daromad qilayapman, nasib etsa senga yaqin-orada bir otar qo'y sotib olishingga yetadigan pul beraman. Xo'sh, senga nima yetmaydi o'zi? Boriga qanoat qilmay, besh qo'lni og'izga tiqishga hojat bormi?\n" +
                    "\n" +
                    "— Bor, belgilarga qarab qadam tashlash kerak, — beixtiyor og'zidan chiqib ketdi bo'zbolaning va shu lahzadayoq u aytgan gapiga afsuslandi: axir, bu savdogar sehrli qariyani uchratmagan-ku.\n" +
                    "\n" +
                    "\"Buni Xayrli Ibtido deydilar, — qariyaning gapi uning yodiga tushdi. — Yangi ish boshlaganlarga omad yor bo'ladi. Zero, hayot insonning o'z Taqdiri yo'lidan borishiga xayrixohdir\".\n" +
                    "\n" +
                    "Shu orada xo'jayin Santyago aytgan gapni fahmlab oldi. Ayonki, uning bu do'konga qo'ygan qadami xayru barakadan belgi berdi — pul oqib kela boshladi va Savdogar bu ispan bolani yollaganiga hech ham pushaymon bo'lmadi. Garchi qilayotgan mehnatiga kutganidan ko'ra ko'p daromad olayotgan esa-da, Savdogar ishlari bu qadar yurishib ketishini o'ylamay turib bo'zbolaga binoyiday haq to'lashni taklif qilgandi. Bola yaqin-orada qo'ylariga ketib qoladiganday tuyuldi unga.\n" +
                    "\n" +
                    "— Ehromlar senga nima uchun zarur bo'lib qoldi? — so'radi u mavzuni o'zgartirish maqsadida.\n" +
                    "\n" +
                    "— Menga ular haqida juda ko'p gapirib berishgan, — javob qildi Santyago.\n" +
                    "\n" +
                    "Xazina endi alamli xotiraga aylangani bois, bo'zbola bu haqda o'ylamaslikka harakat qildi, shu bois xo'jayinga ko'rgan tushini aytib o'tirmadi.\n" +
                    "\n" +
                    "— Umrimda birinchi marta ehromlarni o'z ko'zi bilan ko'rish uchun sahroni kezib o'tishga chog'langan odamni uchratishim. Ehrom degani — bu shunchaki bir sangzor-ku. O'zing ham hovlingda buni qursang bo'ladi.\n" +
                    "\n" +
                    "— Bundan chiqdi, sizning tushingizga biror marta uzoq begona yurtlar kirmagan ekan, — dedi unga javoban Santyago va navbatdagi xaridor tomon yurdi.\n" +
                    "\n" +
                    "Oradan ikki kun o'tib, xo'jayin Santyagoning peshtaxtani do'kon tashqarisiga chiqarish haqidagi taklifini esladi.\n" +
                    "\n" +
                    "— Men har xil yangiliklarga ishqiboz emasman, — dedi u. — Qolaversa, Hasanday boy ham emasman, u xato qilib qo'yishdan qo'rqmaydi, chunki bu unga qimmatga tushmaydi. Sen bilan men esa o'z xatolarimiz uchun umr bo'yi jabr chekamiz.\n" +
                    "\n" +
                    "\"To'g'ri aytadi\", — o'yladi bo'zbola.\n" +
                    "\n" +
                    "— Qani, menga ayt-chi, peshtaxtani ko'chaga chiqarib, idishlarni terib qo'yishning senga nima nafi bor? — davom etdi xo'jayin.\n" +
                    "\n" +
                    "— Men qo'ylarimning oldiga tezroq qaytishni xohlayman. Ishimiz o'ngidan kelib turganda fursatni boy bermaylik, omadimizdan foydalanib qolaylik. Buni Xayrli Ibtido, deyishadi. Yangi ish boshlaganlarga omad yor bo'ladi.\n" +
                    "\n" +
                    "Qariya biroz sukut saqlab, javob qildi:\n" +
                    "\n" +
                    "— Payg'ambarimiz bizlarga Qur'onni berdi va zimmamizga besh farzni qo'ydi, ularni biz umrimiz mobaynida ado etmog'imiz lozim. Eng muhimi — Ollohning borligi va birligi — shuni yodda tutib yashamoq. Qolgan to'rtta shart — bir kunda besh vaqt namoz o'qish, Ramazon oyida ro'za tutmoq, beva-bechoralarga xayr-ehson qilmoq…\n" +
                    "\n" +
                    "U yana jimib qoldi. Payg'ambarni tilga olayotib uning ko'zlari namlandi, garchi u foniy dunyoda yashayotgan, betoqat va qiziqqon banda esa-da, baribir musulmonchilikning qonun-qoidalariga, payg'ambar Muhammad buyurganlariga amal etib yashayotgan edi.\n" +
                    "\n" +
                    "— Xo'sh, beshinchi shart-chi? — so'radi Santyago.\n" +
                    "\n" +
                    "— O'tgan kuni sen menga, tushingizga biror marta uzoq begona yurtlar kirmagan ekan, deding. Bilib qo'y, har bir musulmonning zimmasidagi beshinchi farz — haj safarini amalga oshirmoqdir. Bizlarning har birimiz umrimizda bir bor bo'lsa-da muqaddas Makka shahrini ziyorat qilishimiz shart. Bu shahar ehromlardan ham uzoqda. Yoshligimda ozroq pul topib, mana shu do'konni olgan edim. O'ylardim: boyib ketsam, albatta, Makkaga boraman, deb. Keyin qo'lim pul ko'rdi, mol-dunyo orttirdim, biroq savdoni hech kimga ishonolmadim, chunki men sotadigan buyumlar juda nozik. Va har kuni haj safariga otlanganlarga ko'zim tushadi, ularning orasida badavlatlari bor — o'nlab xizmatkorlariyu butun bir tuya karvoni ularni kuzatib boradi, biroq yo'l olganlarning ko'pchiligi mendan ko'ra kambag'al bandalar. Men ularning nechog'li xushbaxt bo'lib qaytib kelishganini va uylarining eshigiga Makkaga hajga borishganidan darak beradigan belgi qo'yishganini ham ko'rganman. Ularning biri, eski poyafzallarni yamaydigan etikdo'z menga sahroda bir yil yo'l yurdik, biroq Tanjerda qo'shni mahallaga ko'n olgani borganimda charchab qolardim, haj safarida hecham toliqmadim, deb aytdi.\n" +
                    "\n" +
                    "— Nega hoziroq to'g'ri Makkaga yo'l olmaysiz? — so'radi Santyago.\n" +
                    "\n" +
                    "— Chunki men haj safari umidi bilan tirikman. Bo'lmasa, men ikki tomchi suvday mana shu yakrang, zerikarli kunlarga, buyumlarim terib qo'yilgan bu o'lik jovonlarga, har kuni qatnaydigan o'sha kir-chir yemakxonaga — shu turush-turmushga chiday olarmidim. Qo'rqaman, nasib etib umid-orzuim ro'yobga chiqquday bo'lsa, undan keyin hayotda tayanib yashaydigan boshqa ilinjim qolmaydi. Sen esa bosh-qachasan, menga o'xshamaysan, o'z orzu-niyatingga yetishishga ishtiyoqing zo'r. Mening faqat Makka xayoli bilan yashagim bor. Sahroni kezib o'tishim, muqaddas tosh turgan maydonga borishim, uning tevaragini yetti bor aylangach, tavof olishimni minglab marta ko'z oldimga keltirganman. Biroq qo'rqaman umidsiz bo'lib qolishdan, shuning uchun orzu-niyatimdan ayrilib qolmay deyman.\n" +
                    "\n" +
                    "Shu kuni u Santyagoga do'kon tashqarisida yangi peshtaxta taxlashga ruxsat berdi. Hamma bir xilda orzu qilib, bir xil tush ko'rmaydi.\n" +
                    "\n" +
                    "Oradan tag'in ikki oy o'tdi — tashqariga qo'yilgan peshtaxta juda qo'l keldi: do'kondan odam arimay qoldi. Santyago chamalab ko'rdi: ishlar shu zaylda ketsa yarim yildan so'ng u Ispaniyaga qaytadi, boz ustiga, oltmish emas, yuz yigirma bosh qo'y sotib oladi. Bir yil ichida suruviga suruv qo'shiladi va u arablar bilan savdoni boshlab yuboradi, chunki endi ularning tilida gapirishga baharnov o'rgandi. Bozordagi o'sha voqeadan beri u to'rvasidan Urim va Tumim toshchalarini qaytib olmagandi, boisiki, Misr uning uchun, xuddi xo'jayiniga Makka safari ushalmas orzuga aylanganiday, qo'l yetmas yulduz bo'lib qoldi. Yumushi uni qoniqtirar va doim xayolida kemadan Tarifga g'olib sifatida tushib kelishini tasavvur qilardi.\n" +
                    "\n" +
                    "\"Yodingda tut: hamma vaqt aynan nimani istashingni aniq bilgin\", degan edi Malkisidq.\n" +
                    "\n" +
                    "Bo'zbola bilardi va ko'zlagan maqsadiga yetishish uchun ter to'kardi. Ehtimol, begona yurtga kelib qolish, bu joyda aldoqchiga yo'liqish, keyin esa bir pul sarflamay suruvini ikki baravar ko'paytirib olish — bularning bari uning peshonasiga bitilgandir?\n" +
                    "\n" +
                    "U o'zidan mamnun edi. Ko'p narsani o'rgandi: endi billur sotishni eplaydi, so'z ishlatilmaydigan tilni egalladi, belgilarni baloday uqadi. Bir safar u kimdir birovning yozg'irayotganini eshitib qoldi: bu yerga chiqib kelguningcha sillang quriydi, na o'tiradigan joy, na bir ho'plam choy bor. Buning bir belgi ekanini Santyago darhol payqadi va xo'jayinga dedi:\n" +
                    "\n" +
                    "— Qirga chiqib kelayotganlarga choy sotsak nima qiladi?\n" +
                    "\n" +
                    "— Yaxshi taklif, o'ylab ko'rsa arziydi, — dedi u.\n" +
                    "\n" +
                    "— Choyni billur idishlarga quyib uzatamiz. Odamlar bundan zavqlanadi, bizdan billur sotib olgilari keladi. Odamlar go'zallikka o'ch bo'lishadi.\n" +
                    "\n" +
                    "Xo'jayin bir so'z demay unga ancha qarab turdi. Biroq shomga yaqin, nomozni o'qib, do'konni bekitgach, qarshidagi tosh yo'lakka o'tib o'tirib oldi va Santyagoga arablar qo'lma-qo'l qilib chekadigan g'aroyib chilimni taklif qildi.\n" +
                    "\n" +
                    "— Qani menga ayt-chi, sen nimaga erishmoqchisan o'zi? — so'radi u bo'zboladan.\n" +
                    "\n" +
                    "— O'zingiz bilasiz-ku, men uyimga qaytishni xohlayman, qo'y sotib olmoqchiman. Buning uchun menga pul kerak.\n" +
                    "\n" +
                    "Qariya chilimga cho'g' tashladi va qurullatib tortdi.\n" +
                    "\n" +
                    "— O'ttiz yildan beri shu do'konda savdo qilaman. Billurning tozasini yomonidan farqlay olaman, savdoning sir-asrorini bilaman. Ishim yurishib turganidan dumog'im chog', yana kengaytirishga esa hafsalam yo'q. Xaridorlarga billurda choy uzatib tursang va qarasangki, chindan daromad oshgandan oshsa; unda butun do'konu dastgohni yangilashga to'g'ri keladi.\n" +
                    "\n" +
                    "— Xo'sh, buning nimasi yomon?\n" +
                    "\n" +
                    "— E, men shunday yashashga o'rganib qolganman-da. Sen bu yerda yo'g'ingda ko'p xayol surardim: ne zamonlardan beri shu joyda muqim o'tiribman, bu orada oshnalarim bir yoqlarga ketishdi, yana qaytib kelishdi, birlarining bozori kasod bo'ldi, boshqalari boyib ketishdi. Alam bilan shularni o'ylardim. Endi amin bo'layapman, do'konim o'zimning imkonimga mos, o'zim xohlagan o'lchamdan ekan. Uni kengaytirishga hecham rag'batim yo'q, o'zi bunday o'zgarishlar qanday qilinadi — bilmayman ham. O'zi bilan o'zi andarmon odamman.\n" +
                    "\n" +
                    "Bir nima deyishga bo'zbolaning tili aylanmadi. Qariya davom etdi:\n" +
                    "\n" +
                    "— Seni mening qoshimga go'yo Ollohning o'zi yubordi. Bilasanmi, bugun men nimani angladim: Ollohning inoyatiga shukr qilmaslik la'nat bo'lib qaytadi. Men hayotdan bundan ortiq yana nimalarnidir ta'ma qilmayman, sen esa meni qaylargadir boshlamoqchi bo'lasan. O'sha yoqlarga qarab turib o'zimning qurbimni anglab yetaman va o'zimni burungidan-da battar his etaman. Qo'lim uzayib, imkoniyatim oshgan bir paytda endi menga ko'p narsaning keragi yo'q.\n" +
                    "\n" +
                    "\"Makkabodroq sotuvchiga bir nima deb gapirmaganim ham yaxshi bo'lgan ekan\", — o'yladi Santyago.\n" +
                    "\n" +
                    "Ular biroz chilim chekib o'tirishdi. Quyosh botdi. Xo'jayin bilan bo'zbola arabchada gaplashardi — Santyago bu tilni egallab olganidan mamnun edi. Bir paytlar, boshqacha yashab yurgan vaqtlarida, unga go'yo qo'ylar hamma narsani fahmlaydiganday tuyulardi. Biroq arab tilini ular hech qachon o'rganolmaydi.\n" +
                    "\n" +
                    "\"Demak, ular o'rganolmaydigan boshqa narsalar ham bor, — o'yladi u, xo'jayinga jim qarab qo'yarkan. — Chindan, ular o't bilan suvni qidirishni biladi, xolos. Bunga ham o'zlari o'rgangani yo'q — men o'rgatdim ularni\".\n" +
                    "\n" +
                    "— Maktub, — dedi nihoyat billur sotuvchi.\n" +
                    "\n" +
                    "— Bu nima degani?\n" +
                    "\n" +
                    "— Uni bilish uchun arab bo'lib tug'ilish kerak, — javob qildi u. Ma'nosi, taxminan, \"shunday bitilgan\" degani.\n" +
                    "\n" +
                    "U chilimning cho'g'larini o'chira turib, Santyagoga ertadan boshlab billur idishlarda choy sotishing mumkin, dedi. Hayot daryosini to'xtatishning iloji yo'q.\n" +
                    "\n" +
                    "Odamlar mashaqqat chekib qiyalikdan yuqoriga o'rlar va tuyqusdan tepada ro'paradagi do'konga ko'zlari tushib qolar, bu joyda ularga bejirim billur idishlarda yaxna xushta'm chanqovbosdi choy taklif etishardi. Shunday damda do'konga bosh suqmay, choydan ichmay bo'ladimi?!\n" +
                    "\n" +
                    "\"Bu mening xotinimning yetti uxlab tushiga ham kirmaydi!\" — dedi bir nechta billur idish xarid qilgan kishi: shu kuni kechqurun unikiga mehmon keladigan va u ana shu chiroyli billurlar bilan ularning ko'nglini ovlamoqchi edi.\n" +
                    "\n" +
                    "Boshqa bir xaridor billurda ichilgan choyning ta'mi zo'r bo'ladi, choy billurda xushbo'yligini saqlaydi, dedi. Yana biri esa Sharqda azaldan billurda choy ichish an'anasi borligini yodga oldi, chunki billur sehrli xususiyatga ega, dedi u.\n" +
                    "\n" +
                    "Tez orada bu hojatbarorlik ixtirosi hammaning qulog'iga yetdi va xaloyiq ko'hna hunarga qanday qilib yangidan jon kiritish mumkinligini o'z ko'zlari bilan ko'rish ishtiyoqida qirga o'rlab kelaverdi. Bu orada billur idishlarga choy quyib beradigan boshqa qo'nalg'alar ham paydo bo'ldi, biroq u joylarga terlab-pishib, mashaqqat chekib o'rlab borilmasdi, shu bois ular bo'm-bo'sh edi.\n" +
                    "\n" +
                    "Ko'p o'tmay do'konga yana ikki nafar dastyor yollashga to'g'ri keldi. Endi bu yerda billur sotishdan tashqari, yangilikka ishqiboz bo'lib kelgan son-sanoqsiz kishilarga tinimsiz choy ulashilardi.\n" +
                    "\n" +
                    "Shu taxlit yarim yil o'tdi.\n" +
                    "\n" +
                    "Quyosh chiqmay turib Santyago uyg'ondi. Afrikaga ilk bor qadam bosganidan beri o'n bir oy-yu to'qqiz kun o'tibdi.\n" +
                    "\n" +
                    "U oq matodan tikilgan, atay bugungi kunga deb xarid qilingan arabcha burnusni kiydi, boshini ro'mol bilan yopdi va ustidan tuya terisidan qilingan halqani solib tortdi-da shippakni oyog'iga ilib, ovoz chiqarmay pastga tushdi.\n" +
                    "\n" +
                    "Shahar hali uyquda. Santyago murabbo bilan bir to'g'ram non yedi, billur stakanda qaynoq choy ichdi. Keyin do'konning bo'sag'asiga o'tirib chilim chekdi.\n" +
                    "\n" +
                    "U shu taxlit yolg'iz o'zi xayoliga hech nimani keltirmay, sahro hidini ufirib bir tekis, tinimsiz esayotgan shamol sasiga quloq tutib chekib o'tirdi. Chekib bo'lib, qo'lini cho'ntagiga tiqdi — bir necha daqiqa cho'ntagidan olgan narsaga qarab turdi.\n" +
                    "\n" +
                    "Uning barmoqlari bir siqim pulni siqib ushlab turardi — bu pullarga qaytish uchun patta olsa ham bo'ladi, yana yuz yigirma bosh qo'y va tag'in hozir o'zi turgan mamlakat bilan Ispaniya o'rtasida savdo qilish uchun ruxsatnoma xarid qilsa ham bo'ladi.\n" +
                    "\n" +
                    "Santyago xo'jayinning uyg'onib, do'konni ochishini toqat bilan kutdi. Keyin ular birgalikda yana choy ichishdi.\n" +
                    "\n" +
                    "— Bugun men jo'nayman, — dedi bo'zbola. — Endi menda qo'y sotib olishga, sizda esa Makkaga borishga yetarli mablag' bor.\n" +
                    "\n" +
                    "Xo'jayin sukut saqladi.\n" +
                    "\n" +
                    "— Meni duo qiling, — jiddiy ohangda dedi Santyago. — Siz meni qo'lladingiz.\n" +
                    "\n" +
                    "Qariya hanuz churq etmay choy qaynatish bilan mashg'ul edi. Nihoyat u bo'zbola tomon burildi.\n" +
                    "\n" +
                    "— Men sen bilan faxrlanaman. Sen do'konimni jonlantirib yubording. Biroq bilgin: men Makkaga bormayman. Yana shuni ham bilib qo'ygin: sen qo'y sotib olmaysan.\n" +
                    "\n" +
                    "— Kim aytdi sizga buni? — hayron bo'lib so'radi Santyago.\n" +
                    "\n" +
                    "— Maktub, — qisqa javob qildi billur sotuvchi Savdogar.\n" +
                    "\n" +
                    "Va u bo'zbolani duo qildi.\n" +
                    "\n" +
                    "Shundan so'ng Santyago o'zi yotadigan xonaga kirdi va ul-bul narsalarini yig'ishtirdi — lash-lushlari uch qop bo'ldi. Eshikdan chiqayotib uy burchagida yotgan eski cho'ponlik to'rvasini ko'rib qoldi, ko'pdan beri ko'zi tushmagani uchun to'rvani yodidan chiqarib yuborgan edi. Uning ichida kamzuli va kitobi bor. U kamzulini, ko'chada birorta bolaga sovg'a qilarman, degan mo'ljal bilan to'rvadan chiqardi va shu payt bir juft tosh — Urim va Tumim yerga tushib dumalab ketdi.\n" +
                    "\n" +
                    "Shu damda bo'zbola keksa podshohni esladi va qancha vaqtdan beri u haqda o'ylamaganiga ajablandi. Axir, butun bir yil uzluksiz ter to'kib mehnat qilishga to'g'ri keldi, chunki pul topish kerak, Ispaniyaga quruq qo'l bilan so'ppayib borib bo'lmasdi-da.\n" +
                    "\n" +
                    "\"Orzu-umidlaringdan hech qachon voz kechmagil, — degan edi unga Malkisidq. — Belgilarga ergash\".\n" +
                    "\n" +
                    "Bo'zbola toshlarni terib oldi va shu payt uni yana g'aroyib tuyg'u chulg'adi, go'yo qariya yonginasida edi. Mashaqqatli mehnat bilan o'tdi shu bir yil, endi esa belgilar bu yerdan jo'nab ketishga ishora qilayotir.\n" +
                    "\n" +
                    "\"Men yana avval qanday bo'lsam, aynan o'sha zaylimga qaytaman, — o'yladi u, — biroq qo'ylar meni arabcha gapirishga, baribir, o'rgata olmasdi\".\n" +
                    "\n" +
                    "Biroq qo'ylar unga muhim bir saboq bergan edi: dunyoda barchaga birday tushunarli so'zsiz til borligini o'rgatgandi. O'tgan bir yil mobaynida savdo-sotiqni jonlantiray, deb Santyago ana shu — hammaga tushunarli tilda gapirdi. Bu g'ayratbaxsh, zavq-shavqli til edi, ishni mehr-muhabbat va xohish-iroda bilan qiladigan, ishonchu xohishingga quvvat beradigan til edi. Tanjer endi unga begona joy emas, endi bo'zbolaning dunyoni, xuddi bu shaharni zabt etganiday, zabt eta olishga ko'zi yetib turardi.\n" +
                    "\n" +
                    "\"Agar biror-bir narsani chin dildan orzu qilsang, butun Olam uning amalga oshishiga ko'maklashadi\", — keksa Malkisidq shunday degan edi.\n" +
                    "\n" +
                    "Biroq qariya faqat orzu qilib, amalda uni chin dildan istamaydigan talonchilar, behudud sahro-yu odamlar haqida churq etmadi. U bo'zbolaga ehrom deganlari shunchaki sangzor ekani, agar xohlasa har qanday odam chorbog'ida bunday toshlar uyumini tiklay olishi haqida ham gapirmadi. Biroq keksa podshoh unga, agar orttirib qo'y sotib olishga pul yig'a olsa, bu qo'ylarni u sotib olishi kerakligini aytib qo'yishni unitgandi.\n" +
                    "\n" +
                    "Santyago to'rvasini olib, boshqa lash-lushlariga qo'shib qo'ydi. Xo'jayin xaridorlarga xizmat qilar, yana ikki nafar xaridor do'kon ichida billur idishlarda choy ichishib, aylanib yurishardi. Bunday mahalda do'konda, odatda, xaridorlar ko'p bo'lmasdi. Shu damda Santyago xo'jayinning sochlari Malkisidqning sochlarini eslatishini payqadi. Tanjerdagi birinchi tong mahali uning yodiga tushdi, o'shanda na boradigan joyi va na biror yeguligi bor edi; qandolatchining tabassumi ham yodiga tushdi va bu tabassum ham keksa podshohni esiga soldi.\n" +
                    "\n" +
                    "\"Xuddi Malkisidq bu yerdan o'tganday, hamma narsada o'zining izini qoldirganday, — o'yladi bo'zbola. — Go'yo bu odamlar o'z hayotlarining qaysidir pallasida u bilan uchrashganday. Biroq u menga: kimki o'z Taqdiri yo'ldan borayotgan bo'lsa, men unga ko'rinaman, degan edi\".\n" +
                    "\n" +
                    "U xayrlashmay chiqib ketdi — begonalar oldida yig'lashni or bildi. Biroq u bu joyni, mana shu makonda o'rganib, odatlanib qolgan narsalarni qo'msashini, sog'inishini tushunardi. Bu joyda u o'ziga ishonch va dunyoni zabt etguday ishtiyoq paydo qildi.\n" +
                    "\n" +
                    "\"Axir, men qo'y boqadigan tanish joylarga qaytayapman\", — o'yladi u, biroq bunday xush xayol ham negadir uning ko'ngliga chiroq yoqmadi. Orzuimni amalga oshiray deb bir yil ishladi, mana endi bu orzu ushalay deb turganda daqiqa sayin o'zining jozibasini yo'qota boshlayapti. Balki bu, umuman, orzu emasdir?\n" +
                    "\n" +
                    "\"Ehtimol, billur sotuvchiga o'xshagan bo'lish kerakdir? U kabi bir umr Makkani orzu qilib, hech qachon safarga chiqmagan ma'qulmikan?\" — o'yladi bo'zbola, biroq u qo'lida ushlab turgan toshlar g'oyibdan unga keksa podshohning quvvati va qat'iyatini berayotganday edi.\n" +
                    "\n" +
                    "G'aroyib tasodif tufaylimi yoki bu ham bir belgidan darakmi, ishqilib, u hozir Tanjerga kelgan birinchi kunda bosh suqqan yemakxonaga kirdi. Albatta, o'shanda unga duch kelgan tovlamachining qorasi ko'rinmasdi. Xo'jayin choy keltirdi.\n" +
                    "\n" +
                    "\"Cho'ponlikka xohlagan paytim qaytaveraman, — o'yladi Santyago. — Qo'y boqishni, jun qirqishni eplayman va bu yumush bilan pul topa olaman. Biroq boshqa paytda ehromlarga borish uchun hozirgiday imkoniyat bo'lmasligi mumkin. Ko'kragiga oltin sipar taqqan qariya mening butun o'tmishimni bilardi. Menga haqiqiy podshoh va boz ustiga, donishmand uchragan edi\".\n" +
                    "\n" +
                    "Uni Andalusiya dalalaridan atigi ikki soatli yo'l ajratib turardi, biroq ehromgacha bepoyon sahro yastanib yotibdi. Bunga boshqacha qarasa ham bo'lishini u tushundi: hozir yo'l olsa xazinagacha ketadigan vaqt ikki soatga qisqaradi, garchi u, bu orada, bir yilni yo'qotgan esa-da.\n" +
                    "\n" +
                    "\"Nega qo'ylarimga qaytib borgim kelayotgani tushunarli: chunki ularni bilaman, yaxshi ko'raman, ularning tashvish ham aytarli ko'p emas. Biroq sahroga shunday mehr qo'ysa bo'larmikan? Axir, men intilgan xazinamni aynan sahro o'z bag'riga bekitgan-ku. Agar uni topolmasam — uyga qaytaman. Bo'lganicha bo'ldi, hozir pulim ham, vaqtim ham bor, nega bir urinib ko'rmasligim kerak?\"\n" +
                    "\n" +
                    "Shu daqiqada u juda sevinib ketdi. Cho'ponlik doimo uning ilkida. Qolaversa, xohlagan paytda o'zi ham billur savdosi bilan shug'ullana oladi. Albatta, dunyoda xazinalar ham ko'p, biroq boshqa birov emas, aynan uning o'zi bir tushni ikki marta ko'rdi va unga keksa podshoh duch keldi.\n" +
                    "\n" +
                    "U yemakxonadan dumog'i chog' bo'lib chiqdi. Xo'jayiniga billur yetkazib turadigan, sahroda karvon bilan yuradigan bir savdogar yodiga tushdi. Santyago kaftidagi Urim va Tumimni siqdi — shu toshlar sharofati tufayli u yana o'z xazinasini qidirib yo'lga tushishga qaror qildi.\n" +
                    "\n" +
                    "\"Men doimo o'z Taqdiri yo'lidan borayotganlar yonidaman\", — u Malkisidq so'zlarini esladi.\n" +
                    "\n" +
                    "Bu juda oson: savdo omboriga borib, ehromlar bu yerdan uzoq deyishadi, shu rostmi, deb so'rasa bo'lgani.\n" +
                    "\n" +
                    "Angliyalik o'tirgan joy ko'proq og'ilni eslatardi, bu yerdan ter, chang va mol hidi anqirdi. \"Mana shunday yovuqda yashash uchun o'n yil o'qish lozim bo'ldi\", — o'yladi u, kimyoga oid jurnalni parishonxotir varaqlarkan.\n" +
                    "\n" +
                    "Biroq ortga chekingani imkon yo'q. Belgilarga ergashish kerak edi. U butun umrini bani bashar gapiradigan o'sha yagona tilni topishga bag'ishladi, shu uchun o'qidi-izlandi. Dastlab u xalqaro sun'iy til — esperanto bilan mashg'ul bo'ldi, keyin dunyodagi dinlar bilan qiziqdi va nihoyat alkimyoga berildi. Mana endi esperantoda bemalol gapiradi, turli diniy e'tiqodlar tarixini puxta biladi, faqat hali alkimyogar bo'la olgani yo'q. To'g'ri, qandaydir sir-sinoatlarni kashf etdi, lekin ayni paytda bir nuqtada turib qoldi va o'z tadqiqotlarida bir qadam ham oldga siljiy olmayotir. Qaysidir bir alkimyogardan ko'mak topishga behuda urindi — ularning bari ichimdagini top deydigan, g'alati fe'l-atvorli odamlar chiqdi, ularning bari faqat o'zini o'ylar, biror-bir ko'mak yo maslahat olish dargumon edi. Ehtimol, bunday dargumonlik ularning har narsani oltin qiladigan afsonaviy tosh — Iksirning siriga baribir yetisha olmaganliklari tufaylidir.\n" +
                    "\n" +
                    "Angliyalik otasining merosidan bir qismini o'zining samarasiz tajribalariga sovurib bo'ldi. U dunyodagi eng boy kutubxonalarda izg'idi, alkimyoga oid kamyob, o'ta nodir kitoblarni xarid qildi. O'sha kitoblardan bittasida u, ko'p yillar burun Yevropada bo'lgan bir mashhur arab alkimyogari haqida o'qidi; uning ikki yuzdan oshgani-yu, Iksirni topgani va Obi-hayotni kashf etgani haqida keng dovruq taralgandi; bu ovozalar, albatta, angliyalikni ne qadar mutaassir etmasin, agar sahrodagi arxeologik ekspeditsiyadan qaytib kelgan oshnasi o'zi ko'rgan karomatsohib bir arab haqida unga gapirib bermaganida, oddiy afsonaday tuyulardi. U El-Fayum vohasida istiqomat qilarkan. Gap-so'zlarga qaraganda, yoshi ikki yuzda va u har qanday metalni oltinga aylantira olarmish.\n" +
                    "\n" +
                    "Buni eshitgan zahoti angliyalik hamma ishini yig'ishtirdi, uchrashuvlarni bekor qildi va shaxsiy kutubxonasidan eng kerakli kitoblarni oldi-yu, yo'lga tushdi — va mana, u shu yerda, og'ilga o'xshagan badbo'y omonat bostirmada, devor ortida esa Sahro orqali yo'l solishga shaylanayotgan katta karvon turibdi va El-Fayum vohasi shu karvonning yo'li ustida.\n" +
                    "\n" +
                    "\"Men bu la'nati alkimyogarni o'z ko'zlarim bilan ko'rishim kerak\", — o'yladi angliyalik va ayni damda tuyalarning sassig'i ham unga juda badbo'y tuyulmadi.\n" +
                    "\n" +
                    "Shu orada bir navqiron arab, kiftida yo'l to'rvasi bilan, uning oldiga keldi va salomlashdi.\n" +
                    "\n" +
                    "— Yo'l bo'lsin? — so'radi u.\n" +
                    "\n" +
                    "— Sahroga, — javob qildi angliyalik va yana kitob o'qishga tutindi.\n" +
                    "\n" +
                    "Uning vaqti ziq edi: o'n yil o'rganganlarini xotirasida tiklashi kerak; aytib bo'lmaydi, alkimyogar uning bilimini sinab ko'rishni xohlab qoladimi.\n" +
                    "\n" +
                    "Bo'zbola bu orada o'tirib, kiftiga osgan to'rvasidan kitob olib ochdi. Angliyalik kitobning ispan tilida ekanini payqadi.\n" +
                    "\n" +
                    "\"Harqalay, yomonmas\", — o'yladi u, chunki ispanchada arabchaga qaraganda yaxshiroq gapirardi.\n" +
                    "\n" +
                    "Agar bu bola ham El-Fayumga yo'l olsa, bekorchi vaqtda u bilan gurunglashsa bo'ladi.\n" +
                    "\n" +
                    "\"Qiziq, — o'ylardi Santyago, kitobning boshidagi dafn marosimi sahnasini yana qayta o'qib chiqarkan. — Shu kitobni qo'lga olganimga, mana, ikki yil bo'ldi, hanuz birinchi betidan nariga o'tganim yo'g'-a.\"\n" +
                    "\n" +
                    "Bu safar yonida podshoh Malkisidq yo'q xalal beradigan, biroq bo'zbola baribir diqqatini jamlay olmadi. Boz ustiga, o'zi shu qarorga to'g'ri keldimmi, degan fikr uni chalg'itardi. Lekin Santyago eng muhim narsani tushunardi: har qanday ishda qarorga kelish— ishning boshlanishi, xolos. Qachonki odam biror narsaga, tanlab turib qaror qilsa, u go'yo tezkor oqimga sho'ng'iganday bo'ladiki, oqim uni xayoliga keltirmagan joyga oqizib ketadi.\n" +
                    "\n" +
                    "\"Xazinani qidirib yo'lga chiqqanimda billur sotuvchining do'konida ishlayman, deb o'ylamagandim. Shundayin, bu karvon ham, ehtimol, mening tanlovimdir, mening azmu qarorimdir, biroq mening yo'lim o'z-o'zicha sirliligicha qoladi\".\n" +
                    "\n" +
                    "Uning yonida yevropalik o'tiribdi va u ham kitob o'qiyotir. Santyagoga u yoqimsiz odamday ko'rindi: bo'zbola bostirmaga kirganda u yovqarash qildi. Bu, lekin, hech gapmas — ular baribir tanishib olishardi, agar u gapni uzib qo'ymaganida.\n" +
                    "\n" +
                    "Bo'zbola kitobini yopdi — uning bu muhojirga o'xshashga hecham xohishi yo'q edi, keyin cho'ntagidan toshchalarni oldi va ular bilan o'ynay boshladi.\n" +
                    "\n" +
                    "— Urim va Tummim! — hayratlandi yevropalik.\n" +
                    "\n" +
                    "Santyago shoshilib ularni yashirdi.\n" +
                    "\n" +
                    "— Sotilmaydi, — dedi u.\n" +
                    "\n" +
                    "— Bilaman, ular qimmat turmaydi, — javob qildi yevropalik, — oddiy shaffof toshlar, hech qanday xislati yo'q. Dunyoda bunday toshlar millionlab topiladi, biroq sinchkov odamgina Urim va Tummimni darrov payqaydi. Ammo men ularning bu o'lkalarda ham uchrashiga shubhalanmagandim.\n" +
                    "\n" +
                    "— Menga ularni podshoh sovg'a qildi, — javob berdi bo'zbola.\n" +
                    "\n" +
                    "Muhojir, go'yo tildan qolganday, bo'shashgan qo'li bilan cho'ntagidan, xuddi Santyagonikiday, ikkita tosh oldi.\n" +
                    "\n" +
                    "— Sen podshoh bilan gaplashdingmi? — deb yubordi u.\n" +
                    "\n" +
                    "— Ha-da, podshohlarning cho'ponlar bilan gaplashishini sen tasavvur qilishing qiyin, — dedi Santyago. Endi uning gurungni davom ettirish xohishi yo'qolgandi.\n" +
                    "\n" +
                    "— Yo'q, nega endi. Axir, birinchi bo'lib Podshohni cho'ponlar tan olishgan, bu payt Uni hali dunyoda hech kim bilmasdi. Ayni podshohlarning cho'ponlar bilan muloqotining o'zida hech bir ajablanarli hol yo'q, — dedi angliyalik va bo'zbola tushunmadi shekilli degan xavotirda qo'shib qo'ydi: — Bu haqda Injilda o'qisa bo'ladi, o'sha, men Urim va Tummim haqida o'qib bilgan kitobda. Tangri faqat mana shu toshlar bilan fol ochishga izn bergan. Kohinlar ularni oltin ko'krak siparida olib yurishgan.\n" +
                    "\n" +
                    "Endi Santyago omborga kelganiga afsuslanmayotgan edi.\n" +
                    "\n" +
                    "— Ehtimol, bu belgidir, — angliyalik ovoz chiqarib fikrlayotganday gapirdi.\n" +
                    "\n" +
                    "— Kim senga belgilar haqida aytdi? — Santyagoning qiziqishi daqiqa sayin ortib borardi.\n" +
                    "\n" +
                    "— Dunyodagi borki narsalar — belgilar, — dedi angliyalik, jurnalini chetga qo'yib. — Qadim-qadimda odamlar bir tilda gaplashishgan, keyin esa bu tilni unutishgan. Mana shu Umum Tilini men izlayapman. Shu bois bu yerdaman. Men shu Umum Tilini biladigan odamni topishim kerak. Alkimyogarni.\n" +
                    "\n" +
                    "To'ladan kelgan arab — ombor egasining paydo bo'lishi bilan ularning suhbati bo'linib qoldi.\n" +
                    "\n" +
                    "— Omadlaring bor ekan, — dedi arab. — Bugun tushdan so'ng karvon El-Fayumga yo'l oladi.\n" +
                    "\n" +
                    "— Biroq men Misrga borishim kerak! — tashvishlanib xitob qildi Santyago.\n" +
                    "\n" +
                    "— El-Fayum Misrda-da. Sen o'zing qaerliksan?\n" +
                    "\n" +
                    "Santyago Ispaniyadanman, deb javob qildi. Angliyalik xursand bo'ldi: arabcha kiyingan bo'lsa-da, o'zi yevropalik ekan.\n" +
                    "\n" +
                    "— U belgilarni omad, deb ataydi, — dedi u, xo'jayin chiqib ketgach. — Agar men \"omad\" va \"tasodif\" so'zlari haqida kitob yozishga kirishsam, qalingina qomus yuzaga kelardi. Umum Tili aynan shu so'zlardan tashkil topgan.\n" +
                    "\n" +
                    "Shunday deb, u o'zining Santyago bilan uchrashgani, aytgancha, undayam Urim va Tummim bor ekan, bu shunchaki oddiy tasodif emasligini qo'shib qo'ydi. Keyin bo'zboladan mabodo Alkimyogarni qidirayotganing yo'qmi, deb surishtirdi.\n" +
                    "\n" +
                    "— Men xazinani izlayapman, — javob qildi u va xato qilganini payqab, tilini tishladi.\n" +
                    "\n" +
                    "Biroq angliyalik uning gapiga, aftidan, ahamiyat bermadi shekilli, faqat:\n" +
                    "\n" +
                    "— Qaysidir ma'noda — men ham, — dedi.\n" +
                    "\n" +
                    "— Men alkimyoning nimaligini, ochig'i, yaxshi bilmayman, — dedi Santyago, biroq shu payt ombor egasining ularni chaqirgan ovozi eshitildi.\n" +
                    "\n" +
                    "— Karvonga men sarbonlik qilaman, — dedi ularga hovlida soqoli ko'ksiga tushgan, ko'zlari qop-qora kishi. — Men bilan yo'lga chiqadiganlarning hayot-mamoti mening qo'limda bo'ladi, chunki sahro — telbatabiat kimsaday gap, odamlarni tez-tez aqlidan ozdirib turadi.\n" +
                    "\n" +
                    "Ikki yuz choqli odam yo'l tadorikini ko'rishgan, ulovdan — tuyalar, otlar, eshaklar bundan sal kam ikki baravar ko'p. Angliyalikning kitob tiqib joylangan bir necha jomadoni bor ekan. Hovlida ayollar, bolalar va belidagi kamarlariga qilich osgan, kiftlarida uzun qurollari bor erkaklar to'pirlashib turishardi. Shovqin-suronning kuchliligidan Sarbon gapini bir necha marta takrorlashiga to'g'ri keldi.\n" +
                    "\n" +
                    "— Bu yerga turli xil odamlar yig'ilishgan va ular har turli tangrilarga sig'inishadi. O'zim yolg'iz Ollohga sajda qilaman va Uning nomi bilan qasam ichaman: sahroni boz zabt etish uchun ilkimdagi borki imkonimni ishga solaman. Endi har qaysingiz o'z tangringizga sajda qilib, har qanday vaziyatda ham menga bo'ysunishga so'z beringiz. Sahroda sarkashlik qilish — halokatdir.\n" +
                    "\n" +
                    "Past ohangdagi tovushlarning g'ala-g'ovuri ko'tarildi — bu o'z tangrilariga iltijo etayotganlarning tovushi edi. Santyago Iso Masih nomiga qasamyod qildi. Angliyalik sukut saqladi. Bu jarayon qasam ichishga ketadigan vaqtdan biroz cho'zildi — odamlar samodan himoya va xayrixohlik tilashardi.\n" +
                    "\n" +
                    "Shundan so'ng burg'uning cho'ziq tovushi eshitildi va odamlar egarga minishdi. Santyago bilan angliyalik ham o'zlari sotib olishgan tuyalarga bir amallab minib olishdi. Bo'zbola yonidagi yo'ldoshi tuyasiga kitob joylangan og'ir jomadonlarni rosa yuklaganini ko'rib, jonivorga ichi achidi.\n" +
                    "\n" +
                    "— Ammo, aslida, hech qanaqa tasodifning o'zi yo'q, — go'yo allaqachongi gurungni davom ettirgan bo'lib dedi angliyalik. — Mening bu yerga kelishimning sababi, bir oshnam shunday arab haqida eshitgan ekan, u arab…\n" +
                    "\n" +
                    "Biroq uning so'zlarini harakatga kelgan karvon shovqini yutib yubordi. Shunday esa-da Santyago angliyalikning muddaosini juda yaxshi bilardi: voqealarni bir-biriga bog'lab turadigan sirli zanjir bo'ladi. Ayni shu vosita uni qo'ychivonlikka boshladi, bir tushni ikki marta ko'rgani, Afrika qirg'oqlariga yaqin joyga borgani-yu bu shaharchada podshohni uchratgani, tovlamachiga duchor bo'lgani, billur sotadigan do'konga yollangani… hammasi shundan.\n" +
                    "\n" +
                    "\"O'z Yo'lingdan qancha uzoq ketsang, u hayotingni shu qadar izchil belgilaydi\", — o'yladi bo'zbola.\n" +
                    "\n" +
                    "Karvon sharqqa yo'l tortdi. Sahar palla yo'lga chiqilar, quyosh chosh tepaga kelganda dam olish uchun to'xtalar, jazirama issiq biroz tushgach, yana yo'lda davom etilardi. Santyago angliyalik bilan kam gaplashdi — muhojir boshini kitobdan deyarli uzmasdi.\n" +
                    "\n" +
                    "Bo'zbola churq etmay ko'p sonli yo'ldoshlarini kuzatib borardi. Endi ular safar arafasidagi safardoshlariga o'xshamasdi. O'shanda yugur-yugur avjiga mingan: baqiriq-chaqiriq, bola yig'isi va otlarning kishnashi, savdogaru tuyakashlarning hovliqqan, hayajonli ovozlariga qorishib ketgandi. Bu yerda, sahroda esa jimjitlikni doimiy shamolning hushtagi-yu ulovlar tuyog'i ostidagi qumning g'ijirlashigina buzardi. Hatto tuyakashlar ham sukut saqlashardi.\n" +
                    "\n" +
                    "— Men bu qumliklardan ko'p o'tganman, — dedi bir oqshom tuyakashlardan kimdir boshqasiga. — Biroq sahro shunaqangi ulug' va shunaqangi tilsimki, bexosdan o'zingni qum zarrasiday g'arib his eta boshlaysan. Qumning zarrasi esa gungu kar.\n" +
                    "\n" +
                    "Santyago, sahroda birinchi marta bo'layotgan esa-da, tuyakashning nima haqda gapirayotganini tushundi. Uning o'zi ham, dengizga yoki olovga, soatlab bir so'z aytmasdan, hech nimani o'ylamasdan, xayolan bu unsurlarning mislsiz qudratiga tamom asir bo'lganday, termilib o'tira olardi.\n" +
                    "\n" +
                    "\"Men qo'ydan saboq oldim, billurdan saboq oldim, — o'yladi u. — Endi meni sahro o'qitadi. Sahro, meningcha, eng ko'hnasi, sahro — men oldin ko'rganlarim orasida eng donishmandi\".\n" +
                    "\n" +
                    "Shamol esa bu yerda bir nafas ham tin olmas va Santyago Tarifdagi minorada turib uning kuchini qanday his etganini esladi. Andalusiya yaylovlarida o't va suv izlab izg'igan qo'ylarining junini yengil hilpiratib to'zdiradigan mana shu shamol bo'lishi kerak.\n" +
                    "\n" +
                    "\"Endi ular meniki emas, — o'yladi u ortiq g'am chekmay. — Meni unutishgan hamdir, ehtimol, yangi cho'ponga o'rganib qolishgandir. Bo'lganicha bo'lar. Qo'ylar, xuddi u yerdan bu yerga ko'chib-kezib yuradigan odamlarday, ayriliq ham bir zarurat ekanini bilishadi.\"\n" +
                    "\n" +
                    "Shu payt uning yodiga movutchining qizi tushdi — harqalay, u er qilib ketgan bo'lsa kerak. Kimga chiqqan ekan? Makkabodroq sotuvchiga tekkanmikan? Yoki kitob o'qishni biladigan va g'aroyib sarguzashtlar aytib beradigan cho'ponga tegdimikan — Santyagodan boshqa ham bor bundaylar. Shunday bo'lganiga negadir ishonchi komilligi bo'zbolaga kuchli ta'sir o'tkazdi: ehtimol, u Umum Tilini egallagan va endi dunyodagi barchaning buguni va o'tmishini bilar? \"Ko'ngil sezishi\" — bu qobiliyatni uning onasi shunday atagan edi. Endi u tushunardi, bu — jamiki odamlarning taqdirlari o'zaro bog'langan bani bashar tiriklik oqimiga shiddat bilan ruhan cho'mish. Zero, bizga hammasini bilmoq imkoni inoyat etilgan, shu bois ham hammasi allaqachon yozib qo'yilgan\n" +
                    "\n" +
                    "— Maktub, — deb yubordi bo'zbola, billur sotuvchini eslab.\n" +
                    "\n" +
                    "Gohida sahro qumi kutilmaganda tosh-metinga aylanardi. Mabodo karvon xarsangtosh oldidan chiqib qolsa, uni aylanib o'tar, agar toshloq joyga duch kelsa, chetlab yurardi. Qumi juda yumshoq va mayda bo'lgan, tuyalarning tovoni botib qoladigan joyda boshqa yo'l izlashga to'g'ri kelardi. Ba'zan sho'rxok yerda oyoq bosish lozim bo'lar — demak, bu joyda bir zamonlar ko'l bo'lgan — shunday paytda yuk ortilgan jonivorlar ozorlanib o'kirar, kishnardi. Tuyakashlar yerga tushib, ularni silab-siypab tinchlantirar, keyin yukni o'z yelkalariga tashlab olar va yo'lning bu g'irrom qismidan o'tib olishgach, yuklarni tag'in tuya va otlarga ortishardi. Mabodo tuyakashlardan kimdir og'rib yoki o'lib-netib qolsa, birodarlari qur'a tashlab uning tuyalarini kim tortishini aniqlashardi.\n" +
                    "\n" +
                    "Bularning hammasiga bitta sabab bor edi: karvon qancha yo'l bosmasin, yo'lini necha martalab o'zgartirmasin, baribir manzil sari intilar edi. To'siqlarni yengib o'tib, vohaning qaerdaligini ko'rsatib turgan yo'lchi yulduzga qarab yo'l olardi. Azon mahali osmonda yarqiragan yulduzga qarab, odamlar o'zlarini bu yulduz salqin joylarga, suvga, xurmozor va hordiq oladigan manzil sari eltayotganini bilishardi. Faqat yolg'iz angliyalik kitobdan bosh ko'tarmas, go'yo hech nimani payqamayotganday edi.\n" +
                    "\n" +
                    "Santyago ham safarning dastlabki kunlarida kitob o'qishga urinib ko'rdi. Biroq keyin tevarak-atrofga qarab, shamolning nag'masiga quloq tutib ketish bu mashg'ulotdan ko'ra qiziqroq ekanini payqadi. U tuyasining fe'lini o'rgandi. Unga bog'lanib qoldi, keyin umuman kitobdan voz kechdi, ortiqcha yuk, deb hisobladi. Shunday esa-da, qachon kitob ochib ko'z yugurtirsa unda, albatta, biror-bir qiziqarli gap topilishiga ishonardi.\n" +
                    "\n" +
                    "U yonida kelayotgan tuyakash bilan ora-sira gaplashib, oshno bo'lib oldi. Kechqurunlar, dam olish uchun qo'nishib, gulxan tevaragida o'tirishganda, Santyago o'zining qo'ychivonlik hayotidan turli voqealarni so'zlab berardi.\n" +
                    "\n" +
                    "Bir safar tuyakash o'zi haqida gap boshladi:\n" +
                    "\n" +
                    "— Men El-Qayrum yaqinidagi qishloqchada yashardim. Uyim, bog'im, bolalarim bor edi va umrimning oxirigacha bekami-ko'st yashasam bo'lardi. Bir yili, o'shanda hosil juda mo'l bo'ldi, yaxshi daromad qildik va butun oila a'zolarimiz bilan hatto Makkaga bordik— nasib etib musulmonlik farzini ado etdim va endi ko'ngilni xotirjam qilib, qazoyimni kutsam bo'lardi. Yaratganga shukronalar aytardim.\n" +
                    "\n" +
                    "Biroq kunlarning birida yer qalqidi va Nil qirg'oqlaridan toshdi. Beziyonday tuyulgan bu ofat menga ham ziyon yetkazdi. Qo'shnilar zaytunzorlarini toshqin yuvib ketishidan tashvishga tushib qolishdi, xotinim bolalardan xavotirlandi. Boru budimizdan ayrilib qolayotganimizni ko'rib turib dahshatga tushdim.\n" +
                    "\n" +
                    "Shundan so'ng yer hosil bermay qo'ydi— tirikchilikning boshqa yo'lini qidirishimga to'g'ri keldi. Shu bois men tuyakashlikni kasb qildim. O'shanda menga Ollohning: noayonlikdan cho'chimangiz, zotan, har kim o'z xohish-istagiga yarashasini olgay, nimagaki muhtoj esa unga yetishgay, degan kalomining ma'nosi ayon bo'ldi.\n" +
                    "\n" +
                    "Hammamiz ham bor narsalarimizni— bu ekin-tikin bo'ladimi yoki hayotimizmi— yo'qotib qo'yishdan qo'rqamiz. Biroq bu qo'rquv vaqtinchalik, ammo bir narsani tushunib yetish lozimki, bizning qismatimizni ham, olam taqdirini ham bitta qo'l bitgan.\n" +
                    "\n" +
                    "Ba'zan yo'lda ikkita karvon duch kelib qolardi. Shunda bir karvondagi yo'lovchilarda ikkinchisidagi odamlar muhtoj bo'lgan narsalar topilmay qolmasdi. Chindan ham bu olamdagi kechmishlar bari bir qo'l bilan bitilganday go'yo. Tuyakashlar bir-biriga qum bo'ronlari haqida gapirib berishar va gulxanni qo'rg'alab o'tirishib, o'zlari kuzatgan sahroning injiqliklaridan gurunglashardi.\n" +
                    "\n" +
                    "Gohida gulxan atrofidagi gurungga chetdan g'alati-g'alati badaviylar ham kelib qo'shilardi, ular karvon borayotgan yo'lni ipidan ignasigacha bilishardi. Ular qaerda qaroqchilardan va johil qabilalardan ehtiyot bo'lish kerakligini uqtirishar, keyin esa qanday paydo bo'lishgan bo'lsa, xuddi shunday zim-ziyo tunga singib jimgina g'oyib bo'lishardi.\n" +
                    "\n" +
                    "Shunday oqshomlardan birida Santyago bilan angliyalik o'tirgan gulxan oldiga tuyakash keldi.\n" +
                    "\n" +
                    "— Qabilalar o'rtasida urush bo'layotganmish, xabar kelayapti, — darakladi u.\n" +
                    "\n" +
                    "O'rtaga cho'kkan og'ir jimlikdan Santyago chindan xavotir paydo bo'lganini his etdi. U yana bir bor so'zsiz Umum Tilini tushuna olishiga ishonch hosil qildi.\n" +
                    "\n" +
                    "Jimlikni, bu xatar karvon uchun qanchalik xavotirli ekanini aytib, angliyalik buzdi.\n" +
                    "\n" +
                    "— Sahro ichkarisiga kirganingdan so'ng, tamom, orqaga yo'l yo'q, — javob qildi tuyakash. — Demak, faqat oldinga yurish kerak. Qolgani Ollohning qo'lida, Uning o'zi bizni balo-qazodan asraydi. Maktub, — deb gapiga sirli so'zni qo'shib qo'ydi-da, nari ketdi.\n" +
                    "\n" +
                    "— Karvonning ahvoliga e'tiborsiz qarab, sen noto'g'ri qilayapsan, — dedi Santyago angliyalikka. — Zehn solib qara: qancha aylanma yo'llardan yurmasin, karvon baribir manzildan chalg'imay ketayapti.\n" +
                    "\n" +
                    "— Sen esa kitob o'qimay bekor qilayapsan, dunyo nima,\n" +
                    "\n" +
                    "dunyoda nimalar bo'layapti — bexabar qolayapsan, — javob qildi angliyalik. — Bu ma'noda kitoblar karvonlarga o'xshaydi.\n" +
                    "\n" +
                    "Odamlar endi, xuddi ulovlarday, qichab yurishardi. Agar oldinlari ular kunni jim yurib o'tkazishgan, faqat dam olishga qo'nishganda gulxan atrofida gurunglashgan bo'lsa, endi oqshomlari ham churq etishmasdi. Sarbon gulxan yoqishni man etdi: olov qaroqchilar e'tiborini tortishi mumkin.\n" +
                    "\n" +
                    "Sovuqdan saqlanish uchun yo'lovchilar tuyalar va otlarni qo'rg'alab terib qo'yishar, o'zlari esa shu doiraning ichida uymalashib cho'zilishardi. Sarbon qo'riqchilar tayinlardi, ular qo'llarida qurol bilan qo'nalg'ani qo'riqlashardi.\n" +
                    "\n" +
                    "Bir oqshom angliyalikning uyqusi qochdi. U Santyagoni chaqirdi va ular qo'nalg'a atrofida aylanib yurishdi. To'lishgan oy nur sochib turardi va Santyago unga o'zining butun kechmishini aytib berishga qaror qildi.\n" +
                    "\n" +
                    "Uning ko'rgan-kechirganlaridan angliyalikka, ayniqsa, billur sotiladigan do'konda savdo-sotiqning bo'zbola ishlay boshlagach qizib ketgani juda ma'qul bo'ldi.\n" +
                    "\n" +
                    "— Mana, dunyoni harakatlantiradigan kuch, — dedi u. — Alkimyoda bu Olam Qalbi deb ataladi. Agar biror narsani butun borlig'ing bilan xohlasang, shunda Olam Qalbiga uyg'unlashasan. Unda esa juda katta qudrat mujassam.\n" +
                    "\n" +
                    "Shunday deb u qo'shib qo'ydi: qalb faqat odamlarga xos xususiyat emas, olamdagi jamiki unsurlarda — u toshmi, giyohmi, hayvon yoki hatto fikrmi — barisida qalb bor.\n" +
                    "\n" +
                    "— Barchasi, yerda neki mavjud, doimo o'zgarib turadi, chunki yerning o'zi — tirik va qalbga ega. Biz hammamiz shu ulkan Qalbning qismlarimiz, shuning uchun o'zimizga, uning mudom ezgulik qilishi haqida, hisob bermaymiz. Ammo sen, o'sha do'konda ishlagan paytingda billur omadingga imkon tug'dirganini tushunishing kerak edi.\n" +
                    "\n" +
                    "Santyago miq etmay goh oyga, goh oppoq qumga qarab qo'yib, uning gaplarini eshitdi.\n" +
                    "\n" +
                    "— Men karvonning sahroda qanday yurishini ko'rdim, — dedi u nihoyat. — Karvon sahro bilan bir tilda muomala qiladi, shuning uchun ham sahro uning yo'lini ochib qo'yadi. Sahro uning har bir qadamini nazorat qiladi va sinovdan o'tkazadi, agarda o'zi bilan uyg'unligiga ishonch hosil qilsa, uni vohaga o'tkazadi. Bu tilni bilmagan kishi, qanchalik jasur bo'lmasin, safarning boshidayoq halok bo'ladi.\n" +
                    "\n" +
                    "Endi ular ikkalasi ham oyga qarashardi.\n" +
                    "\n" +
                    "— Bu o'sha belgilar sehrining ayni o'zi, — davom etdi Santyago. — Men tuyakashlarning sahro belgilarini qanday uqishlarini ko'rdim — karvon qalbining sahro qalbi bilan sirlashishi bu.\n" +
                    "\n" +
                    "Uzoq jim turganidan so'ng, nihoyat angliyalik so'z qotdi:\n" +
                    "\n" +
                    "— Ha, aftidan, karvonga zehn solib qarashim kerakka o'xshaydi.\n" +
                    "\n" +
                    "— Men esa sening kitoblaringni o'qishim kerak, — javob qildi bo'zbola.\n" +
                    "\n" +
                    "Bu kitoblarni tushunish qiyin edi. Ularda simob va tuz, podshohlar va ajdaholar haqida yozilgandi, biroq harchand urinmasin Santyago hech nimani tushunmadi. Shunday esa-da, baribir, hamma kitoblarda takrorlanadigan bir fikrni u anglab yetdi: olamdagi barcha mavjud unsurlar — ayni bir narsaning turli-tuman ko'rinishlaridir.\n" +
                    "\n" +
                    "Bitta kitobdan u alkimyo haqidagi eng muhim ma'lumotlar — zumrad sathiga chizilgan sanoqli satrlarda ekanini bilib oldi.\n" +
                    "\n" +
                    "— Bu \"Zumrad Lavhasi\" deyiladi, — dedi angliyalik, yo'ldoshiga bilmagan narsalarni o'rgata olishidan mamnun bo'lib.\n" +
                    "\n" +
                    "— Unda buncha kitobning nima keragi bor?\n" +
                    "\n" +
                    "— Mana shu sanoqli satrlarni tushunish uchun, — dedi angliyalik o'ziga unchalik ishonqiramagan ohangda.\n" +
                    "\n" +
                    "Santyagoni, ayniqsa, mashhur alkimyogarlar haqida hikoya qilingan kitoblar qiziqtirdi. Ular laboratoriyalarda metallarni tozalashga umrlarini bag'ishlagan kishilar edi: agar biror-bir metalga uzoq yillar mobaynida ishlov berilaversa, oxir-oqibat o'z xususiyatini yo'qotadi va bu unsur Olam Qalbiga molik bo'ladi, deb ishonishardi ular. Va shunda donishmandlar yer yuzida mavjud har qanday unsurning mohiyatini anglab yetadilar, zotan, Olam Qalbi bu unsurlar o'zaro muloqot qiladigan o'sha tilning ayni o'zi. Ular bu kashfiyotni Ulug' Ijod deb atashadi, u esa ikki: qattiq va suyuq unsurlardan tarkib topgan.\n" +
                    "\n" +
                    "— Bu tilni egallash uchun odamlar va belgilarni o'rganishning o'zi yetarli emasmi? — bilgisi kelib so'radi Santyago.\n" +
                    "\n" +
                    "— Yuzaki qarashga bunchalik o'ch bo'lmasang! — toqatsizlanib javob qildi angliyalik. — Alkimyo — jiddiy fan. Bu fan har bir harakating donishmandlarning yo'l-yo'riqlariga to'la-to'kis muvofiq bo'lishini talab qiladi.\n" +
                    "\n" +
                    "Bo'zbola Ulug' Ijodning suyuq unsuri Obi-hayot deb atalishini, u alkimyogar umriga umr qo'shishidan tashqari, hamma kasalliklarga davo ekanini bildi. Qattiq unsur — bu Iksir.\n" +
                    "\n" +
                    "— Uni topish oson emas, — dedi angliyalik. — Alkimyogarlar ko'p yillar laboratoriyalarida metalga ishlov berish uchun ter to'kishadi. Ular mudom olovga tikilishadi, o'z mashg'ulotlari bilan band bo'lib, tiriklik tashvishlarini unitishadi va bir kun kelib metalni tozalab o'zlari ham poklanishganini payqashadi.\n" +
                    "\n" +
                    "Shunda Santyago billur sotuvchining: idishlarni yuvganingda o'zingning ruhing ham ortiqcha illatlardan tozalanadi, degan gapini esladi. Bo'zbola alkimyoga kundalik turmushda ham o'rgansa bo'lishiga tobora ishonch hosil qilardi.\n" +
                    "\n" +
                    "— Bundan tashqari, — davom etdi angliyalik, — Iksir g'aroyib xususiyatga ega: uning bir ushog'i ham xohlagan hajmdagi metalni oltinga aylantira oladi.\n" +
                    "\n" +
                    "Bu gapni eshitgandan so'ng Santyagoning alkimyoga qiziqishi juda oshdi. Faqat ozgina sabr-toqat kerak, shunda xohlagan narsani oltinga aylantirsa bo'ladi, deb o'yladi u. Axir, u mana shu ishni uddalashgan donishmandlar: Gelvetsiy, Elias, Fulkanelli, Geber haqida o'qigan, o'qiganlari uni hayajonga solgan. Bu odamlar o'z Yo'llarini oxirigacha bosib o'tishgan. Ular dunyo kezishgan, allomalar bilan uchrashishgan, olam sirini bilib bo'lmaydi, degan skeptiklarni lol qoldirish uchun mo''jizalar yaratishgan, chunki — eng muhimi — ular oxir-oqibat Iksir va Obi-hayotni o'z qo'llariga olish imkoniga ega bo'lishgan.\n" +
                    "\n" +
                    "Biroq Santyago Ulug' Ijod nimaligini kitoblardan bilib olishga uringanida boshi berk ko'chaga kirib qoldi: ular ko'plab almoyi-aljoyi suratlardan tashqari, nuqul oldi-qochdi gaplar bilan ham to'lib-toshgan edi.\n" +
                    "\n" +
                    "— Nega alkimyogarlarning ishlari bu qadar chalkash-chulkash? — so'radi bo'zbola bir kuni oqshom o'zining kitoblarini o'qiy olmay zerikib o'tirgan angliyalikdan.\n" +
                    "\n" +
                    "— Chunki ularni tushunish imkoni alkimyo bilan bog'liq jarayonlarning butun mas'uliyatini anglaydigan kishilargagina berilgan. Tasavvur qilib ko'r, agar xohlagan odam cho'yanni oltinga aylantiraversa nima bo'lishini. Tez orada oltinning qadri cho'yan bilan tenglashadi. Qat'iyatli va bilimdonlargagina Ulug' Ijod sirlari nasib etdi. Shuning uchun men hozir bu yerda, sahroning o'rtasidaman. Men sirli yozuvni o'qiy oladigan chin alkimyogarni uchratishim kerak.\n" +
                    "\n" +
                    "— Bu kitoblar qachon yozilgan?\n" +
                    "\n" +
                    "— Ko'p asrlar burun.\n" +
                    "\n" +
                    "— Axir, o'sha paytlar bosmaxonalar bo'lmagan-ku. Qadimda ham, hozir ham — baribir alkimyoni duch kelgan odam egallay olmagan. Shunday ekan, nima uchun bu kitoblar bunaqa murakkab tilda yozilgan, suratlari nega g'alati?\n" +
                    "\n" +
                    "Angliyalik javob bermadi. Faqat keyincha, biroz jimlikdan so'ng: necha kundan beri karvonni sinchiklab kuzatayapman, biroq hech qanday yanglikni payqamadim, dedi. Faqat qabilalar o'rtasida janglar bo'layotgani tez-tez quloqqa chalina boshladi.\n" +
                    "\n" +
                    "Oradan bir necha kun o'tib, Santyago angliyalikka kitoblarini qaytardi.\n" +
                    "\n" +
                    "— Xo'sh, nimalarni tushunding endi ulardan? — yarim hazil, yarim umid ilinjida so'radi angliyalik: tashvishli o'y-xayollardan chalg'ishi uchun uning kim bilandir gurunglashgisi keldi.\n" +
                    "\n" +
                    "— Tushunganim shu bo'ldiki, olamning qalbi bor ekan va kimda kim bu qalbga uyg'unlasha bilsa, mavjudlikning tilini tushunarkan. Tag'in shuni tushundimki, ko'pgina alkimyogarlar o'z Yo'lini topishgan va Olam Qalbi, Iksir hamda Obi-hayotni kashf etishgan, — dedi Bo'zbola va biroz jim turgach, qo'shib qo'ydi: — Eng muhimi, bular bari shu qadar oddiyki, hammasi jajji zumrad sathiga sig'arkan.\n" +
                    "\n" +
                    "Angliyalikning kayfiyati buzildi. Na o'zining uzoq vaqt o'qiganiyu na timsollar, na dono kalomlaru na turli-tuman kimyoviy tajribada ishlatiladigan idishlar — birortasi Santyagoda hech qanday taassurot uyg'otmagan edi.\n" +
                    "\n" +
                    "\"U juda sodda ekan, shu bois tushunmaydi\", — o'yladi angliyalik, keyin kitoblarini yig'ib, tuyaga ortilgan jomadonlariga joyladi.\n" +
                    "\n" +
                    "— Endi o'zingning karvoning bilan shug'ullanaver, — dedi u. — Menga ulardan, xuddi senga mening kitoblarimdan yuqmaganiday, zig'ircha zang yuqqani yo'q.\n" +
                    "\n" +
                    "Santyago tag'in sahro sukunatini tinglamoqqa va qumning tuyalar tuyoqlarida to'zg'iyotganini kuzatmoqqa kirishdi.\n" +
                    "\n" +
                    "\"Har kimning o'zining o'qib-o'rganish usuli bor, — o'yladi u. — Unga meniki to'g'ri kelmaydi, meniki esa — unga. Biroq har ikkalamiz ham o'z yo'limizni qidirayapmiz va faqat shuning uchungina uni hurmat qilmaslik qo'limdan kelmaydi\".\n" +
                    "\n" +
                    "Quyosh ufqdan bosh ko'tara boshlaganda Santyago uyg'ondi. Tunda yulduzlar jilvalangan tomonda endi son-sanoqsiz xurmo daraxtlari ko'zga ilinar, go'yo butun sahroni xurmozor bosib ketganday tuyulardi.\n" +
                    "\n" +
                    "— Yetib keldik! — hayqirdi hozirgina uyqudan turgan angliyalik.\n" +
                    "\n" +
                    "Santyago jim turdi. Buni u sahrodan o'rgangandi, endi daraxtlarga jimgina qarashning o'zi kifoya qilardi. Ehromlargacha hali uzoq. Vaqti kelib bu tong ham uning uchun bir xotiraga aylanadi. Biroq hozir, Sarbon o'rgatganday, u ayni daqiqalar uchun yashayotir, shundan sevinayotir va bu xushbaxt onlarni u o'tkan kunlar xotiralari, kelajak haqidagi orzu-umidlari bilan bog'lashga urindi. Ha, hali bir kun kelib bu ming bir xurmo daraxti ham xotiraga aylanadi, biroq ayni lahzalarda xurmozor soya-salqinni, suv va xavfsizlikni va'da qilib turibdi. Xuddi tunda tuyaning o'kirgani dushman yaqinlab qolganini daraklaganday, qator-qator xurmo daraxtlari azob-uqubatdan xalos etadigan mo''jizadan darak berardi.\n" +
                    "\n" +
                    "\"Dunyo ko'p tillarda tillashadi\", — o'ylardi Santyago.\n" +
                    "\n" +
                    "\"Vaqt tez o'tayotgan paytda karvonlar ham jadal odimlaydi\", — o'yladi Alkimyogar, vohaga kirib kelayotgan yuzlab odamlar va ulovlarga qarab.\n" +
                    "\n" +
                    "Bu yerdagilarning va karvon bilan kelganlarning shovqini eshitildi, ko'tarilgan chang-to'zon quyoshning betini qopladi, bolalar begonalarni ko'rib irg'ishlar, vijillashardi. Alkimyogar qabila boshlig'ining Sarbonga yaqinlashib kelganini va u bilan uzoq suhbatlashganini kuzatib turdi.\n" +
                    "\n" +
                    "Biroq bu olatasir uni qiziqtirmasdi. Qancha odamlar kelib ketmadi, voha ham, sahro ham o'sha-o'sha — mangu va bir zayl. Bu qumlarga shohlarning ham, gadolarning ham qadam bosganini u ko'rgan, garchi shamolning kuchidan o'z shaklini o'zgartirib tursa-da, qumlar ham aslidagiday — Alkimyogar bolaligida qanday ko'rgan bo'lsa o'shanday. Shunday esa-da, zangori osmon va sariq qumni ko'raverib zerikkan har qanday sayyohning ko'ziga xurmo daraxtining yashil shox-barglari ko'ringanda ko'ngilga inadigan sevinch hozir uning ham yuragiga ko'chdi.\n" +
                    "\n" +
                    "\"Ehtimol, tangri sahroni yaratganda, odam daraxtlarga kulib, xursand bo'lib qarasin degandir\", — o'yladi u.\n" +
                    "\n" +
                    "Keyin u nigohini aniq narsalarga qaratishga chog'landi. U bilardi — buni belgilar unga ayon etgandi — ayni shu karvon bilan o'zining pinhona bilimlarining bir qismini ulashishi lozim bo'lgan odam kelayotganini. Garchi Alkimyogar bu odam bilan tanish bo'lmasa-da, sinchkov nazari bilan olomonning ichidan uni tanib olishiga ishonchi komil edi va u o'zining o'tmishdoshidan kam emasligiga umidlanardi.\n" +
                    "\n" +
                    "\"Tushunolmayman, nima uchun bilgan narsalarimning hammasini unga sirli tarzda ma'lum qilishim kerak, — o'yladi u. — Buni aslida sir deyish ham qiyin, zotan, Tangri o'zining sirlarini jamiki mavjudotga bemalol oshkor etadi\".\n" +
                    "\n" +
                    "Alkimyogar buning bitta izohini topdi: avloddan avlodga o'tkazish lozim bo'lgan narsa — bu Sof Hayot hosilasidirki, uni so'zlarda yoki rasmlarda tasvirlab bo'lmaydi. Odamlar esa, so'zlar va rasmlarga berilib ketib, oxir-oqibat Umum Tilini unutishga moyil bo'lishadi.\n" +
                    "\n" +
                    "Karvon bilan kelganlarni darhol mahalliy qabila boshliqlariga olib kirishadi. Santyago o'z ko'zlariga ishonmadi: voha deganlari, tarix kitoblarida yozilganday, ikki-uchta xurmo daraxtiyu quduqdangina iborat emas, balki ayrim ispan qishloqlaridan ko'ra xiyla katta joy ekan. Quduqlarning o'zi bu yerda uch yuz chog'li, xurmo daraxtlari — besh mingtacha, ularning orasida esa turli rangdagi son-sanoqsiz chodirlar bor.\n" +
                    "\n" +
                    "— \"Ming bir kecha\", — dedi angliyalik, u Alkimyogar bilan uchrashishni toqatsizlanib kutayotgandi.\n" +
                    "\n" +
                    "Shu zumdayoq ularni otlarga, tuyalar va odamlarga qiziqsinib qarayotgan bola-baqralar qo'rg'alashdi. Erkaklar yo'lovchilardan sahroda janglarni ko'rdinglarmi, deb so'rashsa, ayollar savdogarlardan qanday matolar, taqinchoqlar olib kelishganini bilishga oshiqardi. Sahroning o'lik sukunati endi tushdagiday tuyular — g'ala-g'ovur avj olgan, kulgi, qiyqiriqlar quloqqa chalinar, go'yo yo'lovchilar sahroda jonsiz-tansiz arvohlarday yurishgan bo'lsa, endi tag'in etli, suyakli odamlarga aylanishganday. Ular mamnun va xushbaxt edilar.\n" +
                    "\n" +
                    "Sarbon Santyagoga vohaning hech qachon tayin bir egasi bo'lmaganini, chunki bu yerda ayollar va bolalargina qo'nim topishganini tushuntirdi. Ular biror-bir tarafning yonini olishmas, jangchilar esa sahro qumlarida jang qilishar, vohani chekinganda jon saqlaydigan pana joy, deb bilishardi.\n" +
                    "\n" +
                    "Sarbon yo'lovchilarni qiyinchiliksiz yig'ib, qabilalar o'rtasidagi janglar tugaguncha karvon vohada qolishini e'lon qildi. Yo'lovchilar, urf-udumga ko'ra, qo'noq olishga hozir mahalliy kishilarning chodirlaridan joy topishadi, dedi u. Shundan so'ng Sarbon quroli borlar qurollarini topshirishini so'radi. Oqshomlari karvonni qo'riqlaganlar ham bundan chetda qolmadi.\n" +
                    "\n" +
                    "— Urushning qoidasi shunday, — tushuntirdi u. — Voha askar yoki jangchilarni qabul qila olmaydi.\n" +
                    "\n" +
                    "Angliyalik cho'ntagidan xromlangan to'pponchani chiqarib, qurol yig'uvchiga berganda Santyago juda hayron qoldi.\n" +
                    "\n" +
                    "— To'pponchaning senga nima keragi bor? — so'radi bo'zbola.\n" +
                    "\n" +
                    "— Odamlarga ishonishga ko'nikish uchun, — dedi angliyalik, uning kayfiyati chog' edi, chunki uzoq yo'l bosib izlayotganini yaqin-orada topishiga ishonardi.\n" +
                    "\n" +
                    "Santyago esa qidirayotgan xazinasini o'ylardi. Orzusiga yetishishga yaqin qolgani sayin yo'lida qiyinchiliklar tobora ortib borayotir. Podshoh Malkisidqning \"boshlovchilarga omad yor bo'ladi\", degan hikmati ham amal qilmay qo'ydi, najot faqat, uning tushunishicha, o'z yo'lini qidirayotgan insonning qat'iyati va jasurligiga bog'liq. Shu bois, u shoshilishi befoydaligini bilar, sabr-toqatidan voz kecholmas, aksincha bo'lganda, Tangrining uning yo'liga qo'ygan belgi-alomatlarini payqamay o'tib ketishi mumkin edi.\n" +
                    "\n" +
                    "\"Tangri hammasini joy-joyiga qo'ygan\", takrorladi u ichida, bu fikrdan ajablanib. Hanuzgacha unga bu belgilar, ocharchilik yoki tashnalik, sevgi azobi yoki mehnat kabi, olamning bir bo'lagiday tuyulardi. Tangrining u bilan muloqotga kirishadigani, undan nimani istayotganini bildiradigani shu til ekani uning xayoliga kelmasdi.\n" +
                    "\n" +
                    "\"Shoshilma, — dedi u o'ziga. — Tuyakashning gapi gap: ovqat mahali ovqatingni yegin, vaqt-soati yetganda — yo'lga chiq\".\n" +
                    "\n" +
                    "Vohaga yetib kelishgach, birinchi kun yo'lovchilar, angliyalik ham, uyqudan to'yib oldi. Santyagoni o'zi tengi besh nafar bola bilan bir chodirga joylashtirishdi. Ularning bari mahalliy bolalar edi, shu bois ular katta shaharlardagi hayotni so'rab bilishga qiziqishardi.\n" +
                    "\n" +
                    "U o'zining qo'y boqqanini aytib, endi billur do'konidagi ishlaridan gap ochmoqchi bo'lganida chodirga angliyalik kirib keldi.\n" +
                    "\n" +
                    "— Ertalab seni rosa qidirdim, — dedi u, Santyagoni tashqariga olib chiqib. — Sen menga keraksan. Alkimyogarni topishimga yordam ber.\n" +
                    "\n" +
                    "Ikki kun ular Alkimyogarni alohida-alohida qidirishdi, o'zlaricha uni boshqalardan farqli yashaydi, chodirida, albatta, tunu kun olov yonib turadi, deb o'ylashgandi. Bu yerdagi chodirlar ular chamalagandan ko'ra bir necha baravar ko'p ekanini anglaguncha, ikkalasi vohani boshdan-oyoq izg'ib chiqishdi — vohada yuzlab chodirlar tikilgan edi.\n" +
                    "\n" +
                    "— Butun bir kun bekorga ketdi, — dedi angliyalik, quduqlardan birining oldida cho'nqayib o'tirarkan.\n" +
                    "\n" +
                    "— Odamlardan so'rab-surishtirish kerakmidi u haqda, — dedi Santyago.\n" +
                    "\n" +
                    "Biroq angliyalik ikkilandi — u o'zining shu yerdaligini oshkor etgisi kelmasdi. Oxir-oqibat u bunga rozi bo'ldi va arabchada yaxshi\n" +
                    "\n" +
                    "gapiradigan Santyagodan Alkimyogarni daraklab chiqishni so'radi. Bo'zbola meshini suvga to'ldirib olish uchun quduqqa kelgan ayolga so'z qotdi.\n" +
                    "\n" +
                    "— Yaxshimisiz, xonim. Aytolmaysizmi, Alkimyogarni qaerdan topsak bo'ladi? — so'radi u.\n" +
                    "\n" +
                    "Ayol bu nomni hech qachon eshitmaganini aytib, ketishga shoshildi. Bungacha esa Santyagoni ogohlantirib, urf-odatlarni hurmat qilishini, qora libosdagi erli ayollarga gap qotmasligini uqtirdi.\n" +
                    "\n" +
                    "Angliyalikning hafsalasi pir bo'ldi. Shuncha yo'l bosib kelsayu, hammasi yo'qqa chiqsa! Bo'zbolaning ham uni ko'rib ko'ngli sovidi — axir, yo'ldoshi O'z yo'lini izlayotir. Bunday paytda, Malkisidq aytishicha, Olam odamga ko'makka keladi, orzuyi ushalishi uchun lozim bo'lgan yordamni beradi. Nahotki, keksa podshoh adashgan bo'lsa?\n" +
                    "\n" +
                    "— Men burun hech qachon alkimyogarlar haqida eshitmaganman, — dedi u. — Bilganimda senga yordam qilishga urinib ko'rardim.\n" +
                    "\n" +
                    "Angliyalikning ko'zlari chaqnadi.\n" +
                    "\n" +
                    "— Shunday demaysanmi! — qichqirdi u. — Bu yerda uning Alkimyogarligini hech kim bilmaydi! Har qanday kasallikni davolay oladigan odam bormi, deb so'rash kerak!\n" +
                    "\n" +
                    "Shu payt qora libosda bir necha ayol quduqqa keldi, biroq Santyago, angliyalikning iltimosiga qaramay, ularga so'z qotmadi. Mana, nihoyat bir erkak kishi ko'rindi.\n" +
                    "\n" +
                    "— Siz bilmaysizmi, bu yerda har qanday kasallikni davolay oladigan kishi bormi? — so'radi bo'zbola.\n" +
                    "\n" +
                    "— Har qanday kasallikni faqat Olloh davolay oladi, — dedi u, kelgindilarga cho'chibroq alanglab qarab. — Jodugarlarni qidirayapsizlarmi?\n" +
                    "\n" +
                    "U Qur'ondan bir necha oyatlarni pichirlab aytib, o'z yo'liga qaytib ketdi.\n" +
                    "\n" +
                    "Biroz o'tgach, boshqa bir odam keldi; uning yoshi ulug'roq, qo'lida chelak bor edi. Santyago unga ham o'sha savol bilan murojaat qildi.\n" +
                    "\n" +
                    "— Bunday odamlarning sizlarga nima keragi bor? — bilmoqchi bo'lib so'radi u.\n" +
                    "\n" +
                    "— Mening oshnam uni ko'rish niyatida juda uzoq yo'l yurib keldi.\n" +
                    "\n" +
                    "— Agar bizning vohada shunday odam bor bo'lsa, u nihoyatda qudratli kishi bo'lishi kerak, — dedi o'ylab turib qariya. — Hatto qabila boshliqlari ham xohlashgan paytda uning huzuriga yo'lay olmaydi. Ularni faqat o'zi istagan paytda qabul qiladi u. Urush tugaguncha kutinglar, keyin ketinglar bu yerdan. Bizning voha turmushiga aralashmaganlaring ma'qul.\n" +
                    "\n" +
                    "Shunday deb u ketdi. Biroq angliyalik, Alkimyogarning izini topganini payqab, juda quvondi.\n" +
                    "\n" +
                    "Quduqqa, nihoyat, qora libosdagi erli ayol emas, balki yelkasida ko'za bilan bir qiz bola keldi. Boshiga ro'mol o'ragan, yuzi ochiq edi. Santyago Alkimyogarni daraklamoqchi bo'lib, unga yaqinlashdi.\n" +
                    "\n" +
                    "Va shunda — go'yo vaqt to'xtab qolganday bo'ldi, Olam Qalbi uning ko'z o'ngida o'zining butun kuch-qudrati bilan namoyon bo'ldi. Qizning qop-qora ko'zlariga, go'yo jilmayishni ham, jim turishni ham bilmayotganday himarilgan lablariga qarab, Santyago bir lahza ichida olam tillashadigan, jamiki odamlar so'zsiz, faqat yurak orqali muloqot qiladigan tilning eng qadrli, eng aqlli bo'lagini fahmlab yetdi. Uni Sevgi deb atashadi, u odam qavmidan-da qadimiy, sahrodan-da ko'hna. Er yigit va bo'y yetgan qiz ko'zlari to'qnashganda bu tuyg'u beixtiyor paydo bo'ladi — hozir, quduq oldida shu hodisa ro'y berdi.\n" +
                    "\n" +
                    "Nihoyat, qizning lablari tabassumni ixtiyor etdi va bu belgi, ayni o'sha — Santyago o'zi bilmagan holda uzoq kutgan, qo'ylaridan, kitoblardan, billur va sahro sukunatidan qidirgan belgi edi.\n" +
                    "\n" +
                    "Bu sof va tushunarli til edi, abadiyat sari yo'l solgan Koinot singari, tarjimaga, sharhu izohga ehtiyoj sezmaydigan so'zsiz zabon edi. Shu bir lahza ichida Santyagoning anglab yetgani shu bo'ldiki, u o'zining qallig'i qoshida turar va qiz ham buni so'zsiz anglab yetmog'i kerak edi. Bunga u zig'ircha shubha qilmas, bu ishonchi ota-onasining ra'yiga qarashdan, odatdagiday, sevganingdan keyin so'rab-surishtirib, sovchi qo'yib, qolaversa, to'yga oz-moz pul jamg'arib, shundan so'ng uylangan ma'qul, deydiganlarning nasihatidan ko'ra kuchli edi.\n" +
                    "\n" +
                    "Biroq bunday maslahat beradigan kishi Umum Tilini bilmaydi, aksincha, bu tilga uyg'unlashganingda o'z-o'zidan ayon bo'ladi: sahroning qoq o'rtasidami yoki gavjum shahardami — doimo kimdir kimnidir kutadi, qidiradi. Ularning yo'llari tutashganda, ko'zlari ko'zlariga tushganda o'tmish ham, kelajak ham o'z mohiyatini tamom yo'qotadi, faqat mana shu bir lahza mavjud bo'ladi va bu yorug' olamda kechadigan barcha kechmishlar faqat bitta qo'l tomonidan yozilganiga cheksiz ishonch barqaror bo'ladi. Bu qo'l qalbda muhabbat alangasini yoqadi va har bir inson uchun, mehnat qilayotgani, dam olayotgan yoki xazina qidirayotganidan qat'i nazar, unga xuddi o'zinikiday alangali qalbni muyassar etadi. Aksincha esa, odam qavmini iztiroblarga solguvchi orzu-niyatlarning zig'ircha ma'nisi qolmasdi.\n" +
                    "\n" +
                    "\"Maktub\", — o'yladi bo'zbola.\n" +
                    "\n" +
                    "Angliyalik o'rnidan sakrab turdi va Santyagoni yelkasidan ushlab silkilay boshladi:\n" +
                    "\n" +
                    "— So'rasang-chi, axir!\n" +
                    "\n" +
                    "Santyago qizga yaqinlashdi. Qiz tabassum bilan u tomonga o'girildi va bo'zbola ham bunga javoban jilmaydi.\n" +
                    "\n" +
                    "— Isming nima? — so'radi u.\n" +
                    "\n" +
                    "— Fotima, — uyalinqirab javob qildi qiz.\n" +
                    "\n" +
                    "— Men yashaydigan o'lkalarda ko'p ayollarning ismi shunday.\n" +
                    "\n" +
                    "— Payg'ambarimizning qizining ismlari shunday ekan, — dedi Fotima. — O'sha uzoq o'lkalarga bu ismni bizning jangchilarimiz eltishgan.\n" +
                    "\n" +
                    "Bu ma'suma va ko'rkam qizning so'zlari g'ururli jarangladi. Angliyalik betoqat bo'lib Santyagoni turtdi va bo'zbola qizdan har qanday kasallikni davolay oladigan odamni bilasanmi, deb so'radi.\n" +
                    "\n" +
                    "— Bu odam dunyoning hamma siridan boxabar, — dedi qiz. — U sahro jinlari bilan muloqot qiladi.\n" +
                    "\n" +
                    "Jin — bu iblis. Qiz bola janubga ishora qildi — ular qidirayotgan odam o'sha tarafda yashashini aytdi. Keyin ko'zasini suvga to'ldirib, ortiga qaytdi.\n" +
                    "\n" +
                    "Angliyalik Alkimyogarni qidirib ketdi. Santyago esa quduq oldida uzoq xayol surib o'tirdi. Bir vaqtlar, o'zining yurtida yurgan paytlarda, sharqdan esgan shamol mana shu qizning muattar bo'yini unga olib kelar va u qizning mavjudligiga hecham shubha qilmay uni sevgan edi, bu sevgini, harqalay, yer yuzidagi borki xazinalardan ustun ko'rardi.\n" +
                    "\n" +
                    "Ertasi kuni u tag'in quduqning boshiga keldi va qizni kutdi. Biroq bu yerda angliyalikni uchratib ajablandi, u birinchi bor sahroga sinchiklab nazar tashlayotgan edi.\n" +
                    "\n" +
                    "— Men qorong'u tushguncha kutib o'tirdim, — dedi angliyalik. — Yulduzlar miltillab chiqa boshlaganda u paydo bo'ldi. Men unga nimani qidirayotganimni aytdim. U bo'lsa qo'rg'oshinni oltinga aylantirishni uddalay oldingmi, deb so'radi. Niyatim ham shuni o'rganish, deb javob qildim men. U tag'in urinib ko'rishimni maslahat berdi. Xuddi shunday dedi: \"Borgin va urinib ko'rgin\".\n" +
                    "\n" +
                    "Santyago jimib qoldi. Angliyalik shu bir og'iz, o'zi ham biladigan gapni eshitish uchun dunyoni kezib shuncha yo'l yurganmidi? Shunda o'zining qo'ylarini Malkisidqqa tekinga berganini esladi.\n" +
                    "\n" +
                    "— Urinib ko'r-da! — dedi u.\n" +
                    "\n" +
                    "— Urinmoqchiman. Hoziroq boshlayman.\n" +
                    "\n" +
                    "Angliyalik ketdi, oradan hayal o'tmay ko'za ko'targan Fotima ko'rindi.\n" +
                    "\n" +
                    "— Men senga faqat bitta gapni aytgani keldim, — dedi bo'zbola qizga murojaat qilib. — Mening qallig'im bo'lishingni xohlayman. Men seni sevaman.\n" +
                    "\n" +
                    "Qiz qo'lidagi ko'zani tushirib yubordi, suv to'kildi.\n" +
                    "\n" +
                    "— Men seni shu yerda kutaman. Men xazinani qidirib sahroni kezdim, xazina ehromlar turgan joyda. Biroq urush boshlanib qoldi. Avval men urushni la'natlagandim. Endi alqayapman, chunki urush sabab bo'lib men sening yoningga keldim.\n" +
                    "\n" +
                    "— Urush ham bir kun tugar, — javob qildi qiz.\n" +
                    "\n" +
                    "Santyago xurmo daraxtlariga nazar soldi. Bir paytlar u cho'pon edi, bu vohada esa qo'ylar serob. Fotima hamma xazinalardan-da aziz… Biroq qiz, go'yo bo'zbolaning fikr-o'ylarini uqqanday, davom etdi:\n" +
                    "\n" +
                    "— Jangchilar xazinani qidirishadi. Sahro ayollari ular bilan g'ururlanishadi.\n" +
                    "\n" +
                    "Keyin u ko'zasini suvga liq to'ldirib, ketdi.\n" +
                    "\n" +
                    "Santyago har kuni quduq oldiga kelardi. U Fotimaga qo'y boqqanlarini, Malkisidq bilan qanday uchrashganini, billur sotganlarini gapirib bergan edi. Shu zayl ular inoqlashib olishdi. Qiz bilan o'n besh daqiqa suhbatlashgan vaqtni aytmaganda, har bir kun bo'zbola uchun bir yilday cho'zilardi.\n" +
                    "\n" +
                    "Oradan bir oy o'tgach, Sarbon yo'lovchilarni jamladi.\n" +
                    "\n" +
                    "— Urush qachon tugashi noma'lum, — dedi u. — Yo'lni davom ettirolmaymiz. Hali janglar to'xtamaydigan ko'rinadi, bir necha yilga cho'zilsa ham kerak. Bir-biriga g'anim bo'lgan qabilalarning har qaysisida jasur, kuchli jangchilar bor, har biri o'z nomusini boy bermaslik uchun maydonni tashlab ketmaydi. Bu yerda yaxshilar yomonlar bilan urushayotgani yo'q, bu yerda hokimiyat uchun jang qilishmoqda, bunday urushlar esa bir boshlansa uzoq vaqt to'xtamaydi, zero, Olloh ularga ham, bularga ham madadkor.\n" +
                    "\n" +
                    "Odamlar tarqalishdi. Santyago Fotima bilan uchrashib, unga Sarbonning gaplarini yetkazdi.\n" +
                    "\n" +
                    "— Uchrashganimizning ertasi kuniyoq, — dedi qiz, — sen menga sevgi izhor qilding. Keyin esa juda ajoyib narsalar — Umum Tili va Olam Qalbi haqida gapirding — men asta-sekin sening bir bo'la-gingga aylanib borayapman.\n" +
                    "\n" +
                    "Santyago uning ovozini eshitib turdi, qizning ovozi xurmo daraxtlari uchidagi barglarning mayin shitirlashidan-da go'zal edi.\n" +
                    "\n" +
                    "— Men seni bu quduq oldida qay mahaldan beri kutib turibman. Men o'zimning o'tkan kunlarimni unutdim, urf-odatlarimni ham unutdim, qabilamiz erkaklarining qizlar o'zini qanday tutishlari kerakligi haqidagi ko'rsatmalarini ham. Bolaligimda bir kun kelib sahro menga, hali hech kimga nasib etmagan ajoyib sovg'a hadya etadi, deb orzu qilardim. Mana, men unga erishdim, bu sensan.\n" +
                    "\n" +
                    "Santyago qizning qo'lidan tutmoqchi bo'ldi, biroq Fotima ko'zani qattiq quchoqlab oldi.\n" +
                    "\n" +
                    "— Sen menga ko'rgan tushlaringni gapirib berding, keksa podshoh Malkisidq haqida, xazinalar haqida aytding. Endi men hech narsadan qo'rqmayman, chunki seni menga ular yetkazdi. Men esa sening orzu-o'ylaringning, sening Taqdiringning bir bo'lagiman. Shuning uchun ham men sening bir joyda to'xtab qolmasligingni, balki qidirayotgan narsangni izlayverishingni xohlayman. Agar urush tugashini kutishingga to'g'ri kelsa, bu fojea emas. Biroq ertaroq jo'nashga imkon tug'ilsa, jo'na, o'z Taqdiringni izlab yo'lga chiq. Shamol qum barxanlarining shaklini o'zgartiradi, xolos, sahro esa aslicha qolaveradi. Bizning sevgimiz ham aslicha qoladi.\n");



            JSONObject content5=new JSONObject();
            content5.put("title","XOTIMA");
            content5.put("text","Bo'zbolaning ismi Santyago edi. U vayron bo'lib yotgan cherkovga yetib kelganida allaqachon qorong'u tushgan edi. Omborxonada hanuz tutanjir ko'karib turar, o'yiq gumbazdan, xuddi burungiday, yulduzlar ko'rinardi. U bir oqshom otari bilan shu yerda tunaganini esladi, o'shanda, ko'rgan tushini aytmaganda, tun xotirjam o'tgandi.\n" +
                    "\n" +
                    "Hozir u yana shu yerda. Biroq bu safar qo'ylarini haydab kelgani yo'q. Uning qo'lida belkurak bor edi.\n" +
                    "\n" +
                    "U osmonga uzoq tikildi, keyin to'rvadan vino olib, bir qultum ichdi. Bir safar oqshom sahroda yulduzlarga termilgani va Alkimyogar bilan vino ichgani yodiga tushdi. Orqada qancha yo'l qolib ketganini va Tangri unga qanaqa g'aroyib usul bilan xazinaga ishora qilganini o'yladi.\n" +
                    "\n" +
                    "Agar u tushlariga ishonmaganida, lo'li kampirni, Malkisidqni, qaroqchilarni uchratmaganida…\n" +
                    "\n" +
                    "\"Bu ro'yxatni uzoq davom ettirish mumkin. Biroq yo'l belgi-alomatlar bilan ko'rsatib qo'yilgan edi, undan men chetga chiqolmasdim\", — o'yladi u.\n" +
                    "\n" +
                    "U o'zi sezmagan holda uxlab qoldi. Ko'zini ochganida quyosh tepaga ko'tarilib ketgan edi. Santyago tutanjirning tagini kovlay boshladi.\n" +
                    "\n" +
                    "\"Keksa sehrgar, — o'yladi u Alkimyogar haqida, — sen barini oldindan bilgansan. Men bu cherkovgacha yetib kelishim uchun oltin quymaning ikkinchi bo'lagini ham menga qoldirding. Ruhoniy meni kiyim-kechagim abgor, o'zimni do'pposlangan alpozda ko'rib kulib yubordi. Sen meni bundan xalos qila olarmiding?\"\n" +
                    "\n" +
                    "\"Yo'q, — u shamolning shitirlagan ovozini yaxshi eshitdi. — Agar men seni ogohlantirganimda, sen ehromlarni ko'rmasding. Ular chindan ham juda go'zal, to'g'rimi?\"\n" +
                    "\n" +
                    "Bu Alkimyogarning ovozi edi. Bo'zbola kuldi va qazishni davom ettirdi. Yarim soatcha vaqt o'tib, belkurak allaqanday qattiq narsaga urildi, tag'in bir soatlardan so'ng Santyagoning oldida qadimgi tilla tangalar bilan liq to'la chiroyli sandiqcha turardi. Sandiqchada tag'in qimmatbaho toshlar, oq va qizil patlar bilan bezatilgan oltin niqoblar, zumrad qoplangan tosh sanamlar bor ediki, jangu jadallarda qo'lga kiritgan bu o'ljalarni g'olib mamlakat allaqachon unutib yuborgan, o'ljalar egasi ular haqida farzandlariga ham hech nima demagan edi.\n" +
                    "\n" +
                    "Santyago to'rvadan Urim va Tumimni oldi. Ular faqat bir marta, ertalabki payt bozorda unga asqotgandi: hayot ularsiz ham bo'zbolaga ishonchli belgilarni ko'rsatib turdi.\n" +
                    "\n" +
                    "Santyago ularni sandiqchaga soldi — bu ham uning xazinasining bir bo'lagi: toshlar unga endi hech qachon uchratmaydigan keksa podshohni eslatib turadi.\n" +
                    "\n" +
                    "\"Hayot chindan ham O'z Taqdiri yo'lidan boradiganlarni siylaydi, — o'yladi u va Tarifga borishi, lo'li kampirga xazinaning o'ndan birini berishi lozimligini esladi. — Lo'lilar chindan dono! Dunyo bo'ylab ko'p kezishlaridan shunday bo'lsa kerak\".\n" +
                    "U yana shamol esayotganini sezdi. Bu \"livantinlik\" edi, Afrikadan yelardi, biroq bu safar o'zi bilan sahro bo'yini olib kelmadi, mavrlar bosqinini daraklamadi. Endi Santyago sekin yaqinlashib kelib, lablariga bo'sa bo'lib qo'ngan muattar bo'yni, mayin tovush va ta'mni farqladi.\n" +
                    "Bo'zbola tabassum qildi: bu Fotimaning ilk o'pichi edi.\n" +
                    "— Men borayapman, — dedi u, — sening yoningga borayapman, Fotima.");


            contents.put(content1);
            contents.put(content2);
            contents.put(content3);
            contents.put(content5);

            firstBook.put("contents",contents);
            mainArray.put(firstBook);
            saveToFile(mainArray.toString());
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);

        } catch (JSONException e) {
            e.printStackTrace();
        }



        super.onCreate(savedInstanceState);
    }

    private void saveToFile(String data) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(getApplicationContext().openFileOutput("book.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }
}
