// Importere skannerobject for brukerinput
import java.util.Scanner;

// Opprette klassen
public class Weekday {
    // Vetta faen
    public static void main(String[] args) {
        // Opprette skannerobjekt og instans av skannerobjekt
        Scanner skannSomF = new Scanner(System.in);
        System.out.println("Skriv inn tallet som tilsvarer dag i uka, altså 1 for mandag, 5 for fredag...: ");
        // Ta imot integer hvor [brukerinput] == tallet etter case[tall]. 1 = er mandag, 2 = tirsdag osv.
        int day = skannSomF.nextInt();

        switch (day) {
            // Mandag
            case 1:
                System.out.println("Mandag");
                System.out.println("Jeg er Andersen på Skarnes, som våkner klokka fire\nFamler etter knappen på et iltert vekkeur\n" +
                        "Snur meg imot veggen for å ta en druntelur. Men tida er det ingen som kan snu\nMå på jobb i Oslo klokka sju.\n" +
                        "Og det er mandag morra blues, mandag morra blues.\nLunker litt på kaffen, tar en pris med snus og nynner mandag morra blues");
                break;

            // Tirsdag
            case 2:
                System.out.println("Too many sad days\nToo many Tuesday mornings\nI thought of you today\nI wished it was yesterday morning");
                System.out.println("I thought of you today\nAnd I dreamt you were dressed in mourning");
                break;

            // Onsdag
            case 3:
                System.out.println("Yesterday I painted our bathroom in all sorts of colors\nAnd the day before I slept in, before I went shopping\nAnd I cooked our meal, seemed to forget the dishes\nAnd I saw a little TV and went to bed...");
                System.out.println("Now it's already Wednessday - half the week is gone\nYet another wednessday of things I haven't done\nThe week flies by like an aeroplane, that's got no destination\nAnd now it's already Wednesday - How'd three days get wasted?");
                break;

            // Torsdag
            case 4:
                System.out.println("Thursday");
                System.out.println("Well it started out just like a dream\nAnd like a dream I knew what we had\nwould have to end\n'cause I was lookin' for a\nlifetime lover and\nyou were lookin' for a friend\nSomeone to be there\nAfter all your night time lovers had gone\nThe way they came\nSomeone who knew the way\nAnd helped to play your daytime game\nIt's not the same");
                break;

            // Fredag
            case 5:
                System.out.println("Friday");
                System.out.println("For det er fredag min venn\nRekk din hånd oppi været\nJesu Krist, du gir meg styrke, du er goood\n" +
                        "For det er fredag min venn\nRekk din hånd oppi været\nJesu Krist du gir meg styrke, du er goood\n");
                System.out.println("Ååå, du er så god\nJeg vet at vi skal samme vei\nÅåå,du er så fin\nJeg vil jo være mer med deg\n");
                System.out.println("For det er fredag min venn\nRekk din hånd opp i været\nJesu Krist du gir meg styrke, du er goood\n" +
                        "For det er fredag min venn\nRekk din hånd oppi været\nJesu Krist du gir meg styrke, du er goood\n");
                System.out.println("Ååå, du er så god\nJeg vet at vi skal samme vei\nÅåå, du er så fin\nJeg vil jo være mer med deg");
                break;

            // Lørdag
            case 6:
                System.out.println("Saturday");
                break;

            // Søndag
            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Er du dum eller? Tall 1-7, du kan det eller?");
        }
    }
}