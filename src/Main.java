public class Main {

    public static void main(String[] args) {
        String coder_text = "ЗТЕФТИ ЧЦФТ!\n" +
                "ЙЛЗ Б ЗЦИЭ Й ГЖКДЭКГШЕБ Ъ НЖДЖЬБДФЁБГЭ.\n" +
                "БЪВАШЬЪ УГЦ ЯЦ ЦЙН УЦИЦВАЮ БВЪХЕД ФАГДЪ.\n" +
                "ЗЛКСВПЗЁ Н ЁЫНЫДТЫ А ЩЛБХШЙЛЁ ХЗИПДН ТПНЙЗ ЫЮРЮЙЗЁ СТРДЖТА. ПГПГ.";
        System.out.println("Исходный текст:\n");
        System.out.println(coder_text);
        System.out.println(" ");
        String decoder_text = Decoder.decoder(coder_text);
        System.out.println("Перевод первых двух строк:\n");
        System.out.println(decoder_text);
        System.out.println("Перевод 3-й строки:\n");
        String[] text = coder_text.split("\n");
        Decoder_methods de_coder = new Decoder_methods();
        for (int i = 1; i < 32; i++) {
            System.out.println(i + ") Возможно перевод такой: " + de_coder.string_1_2(i, text[2]));
        }
        System.out.println("\nПеревод 4-й строки:\n");
        String[] words = text[3].split(" ");
        for (int j = 0; j < words.length; j++) {
            System.out.println("Возможно " + (j + 1) + "-е слово 4-й строки:");
            for (int i = 1; i <= 33; i++) {
                System.out.print(i + ") " + de_coder.string_1_2(i, words[j]) + "\n");
            }
        }
    }
}
