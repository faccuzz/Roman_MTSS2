package it.unipd.mtss;
import static org.junit.Assert.*;
import org.junit.Test;

public class RomanPrinterTest{
    @Test
    public void testPrint(){
        RomanPrinter rp = new RomanPrinter();
        assertEquals(
                "  _____ \n" +
                " |_   _|\n" +
                "   | |  \n" +
                "   | |  \n" +
                "  _| |_ \n" +
                " |_____|", rp.print(1));
        assertEquals(
                " __      __\n" +
                " \\ \\    / /\n" +
                "  \\ \\  / / \n" +
                "   \\ \\/ /  \n" +
                "    \\  /   \n" +
                "     \\/    ", rp.print(5));
        assertEquals(
                " __   __\n" +
                        " \\ \\ / /\n" +
                        "  \\ V / \n" +
                        "   > <  \n" +
                        "  / . \\ \n" +
                        " /_/ \\_\\", rp.print(10));
        assertEquals(
                " _      \n" +
                        " | |     \n" +
                        " | |     \n" +
                        " | |     \n" +
                        " | |____ \n" +
                        " |______|", rp.print(50));
        assertEquals(
                "  _____ \n" +
                        "  / ____|\n" +
                        " | |     \n" +
                        " | |     \n" +
                        " | |____ \n" +
                        "  \\_____|", rp.print(100));
        assertEquals(
                " _____  \n" +
                        " |  __ \\ \n" +
                        " | |  | |\n" +
                        " | |  | |\n" +
                        " | |__| |\n" +
                        " |_____/", rp.print(500));
        assertEquals(
                " __  __ \n" +
                        " |  \\/  |\n" +
                        " | \\  / |\n" +
                        " | |\\/| |\n" +
                        " | |  | |\n" +
                        " |_|  |_|", rp.print(1000));
        assertEquals(
                " __  __   _____     _____   _       __   __ __      __  _____ \n" +
                        " |  \\/  | |  __ \\   / ____| | |      \\ \\ / / \\ \\    / / |_   _|\n" +
                        " | \\  / | | |  | | | |      | |       \\ V /   \\ \\  / /    | |  \n" +
                        " | |\\/| | | |  | | | |      | |        > <     \\ \\/ /     | |  \n" +
                        " | |  | | | |__| | | |____  | |____   / . \\     \\  /     _| |_ \n" +
                        " |_|  |_| |_____/   \\_____| |______| /_/ \\_\\     \\/     |_____|", rp.print(1666)
        )
    }

    @AfterAll
    public void allTestsCompleted() {
        System.out.println("All tests completed successfully. Everything is OK.");
    }
}