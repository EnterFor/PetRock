package net.manmaed.petrock.hats;

import net.manmaed.petrock.PetRockClient;
import net.manmaed.petrock.libs.LogHelper;

import java.net.URL;

/**
 * Created by manmaed on 24/01/2022.
 */
public class PRHats {

    public static boolean christmas = false;
    public static boolean birthday = false;
    public static boolean halloween = false;
    public static boolean easter = false;
    public static boolean loneztar = false;
    public static boolean slowpoke = false;
    public static boolean bear = false;
    public static boolean tnt = false;
    private static boolean userslow = false;
    private static String usernames = "";

    public static void load() {
        HatData hatData = null;
        birthday = false;
        christmas = false;
        halloween = false;
        easter = false;
        bear = false;
        tnt = false;
        slowpoke = false;
        loneztar = false;
        try {
            if (!PetRockClient.iChunHatsLoaded) {
                hatData = HatData.getHatData(new URL("https://raw.githubusercontent.com/manmaed/PetRock/main/hats.json"));
                //hatData = HatData.getHatData(new URL("file:///G:/Modding/Forge/1_16_5/PetRock/run/hattesting.json"));
                String hat = hatData.isEventActive();
                usernames = hatData.getUsername();
                if (!userslow) {
                    if (hat.equalsIgnoreCase("christmas")) {
                        christmas = true;
                    }
                    if (hat.equalsIgnoreCase("halloween")) {
                        halloween = true;
                    }
                    if (hat.equalsIgnoreCase("tnt")) {
                        tnt = true;
                    }
                    if (hat.equalsIgnoreCase("easter")) {
                        easter = true;
                    } else if (hat.equalsIgnoreCase("birthday")) {
                        birthday = true;
                        if (hatData.getUsername().equalsIgnoreCase("manmaed")) {
                            LogHelper.fatal("Please inform manmaed of this error: Happy Birthday!");
                        }
                        if (hatData.getUsername().equalsIgnoreCase("ActuallyBear")) {
                            bear = true;
                        }
                        if (hatData.getUsername().equalsIgnoreCase("Slowpoke101")) {
                            slowpoke = true;
                        }
                        if (hatData.getUsername().equalsIgnoreCase("Loneztar")) {
                            birthday = false;
                            loneztar = true;
                            LogHelper.info("Happy Birthday Loneztar");
                        } else {
                            LogHelper.info("Happy Birthday " + hatData.getUsername());
                        }
                    }
                }
                if (userslow) {
                    /*slowisplaying();*/
                    slowpoke = true;
                    if (hat.equalsIgnoreCase("birthday") & hatData.getUsername().equalsIgnoreCase("Slowpoke101")) {
                        birthday = true;
                        LogHelper.info("Happy Birthday Slowpoke101");
                    }
                    if (hat.equalsIgnoreCase("christmas")) {
                        christmas = true;
                        LogHelper.info("Happy Christmas Slowpoke101");
                /*} else {
                    christmas = false;
                    halloween = false;
                    birthday = false;*/
                    }
                    if (hat.equalsIgnoreCase("halloween")) {
                        halloween = true;
                        LogHelper.info("Happy Halloween Slowpoke101");
                    }
                    if (hat.equalsIgnoreCase("tnt")) {
                        tnt = true;
                    }
                    if (hat.equalsIgnoreCase("easter")) {
                        easter = true;
                        LogHelper.info("Happy Easter Slowpoke101");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void slowisplaying() {
        slowpoke = true;
        userslow = true;
        if (birthday & usernames.equalsIgnoreCase("Slowpoke101")) {
            //    bday = true;
            LogHelper.info("Happy Birthday Slowpoke101");
        }
        if (christmas) {
            //    christmas = true;
            LogHelper.info("Happy Christmas Slowpoke101");
        }
        if (halloween) {
            //halloween = true;
            LogHelper.info("Happy Halloween Slowpoke101");
        }
        if (easter) {
            //halloween = true;
            LogHelper.info("Happy Easter Slowpoke101");
        }
        LogHelper.info("Slowpoke101 Hat Enabled!");
    }

    public static void setHat(String hat) {
        birthday = false;
        christmas = false;
        halloween = false;
        easter = false;
        tnt = false;
        bear = false;
        loneztar = false;
        if (hat.equalsIgnoreCase("halloween")) {
            halloween = true;
        }
        if (hat.equalsIgnoreCase("christmas")) {
            christmas = true;
        }
        if (hat.equalsIgnoreCase("birthday")) {
            birthday = true;
        }
        if (hat.equalsIgnoreCase("easter")) {
            easter = true;
        }
        if (hat.equalsIgnoreCase("tnt")) {
            tnt = true;
        }
        if (hat.equalsIgnoreCase("actuallybear")) {
            bear = true;
        }
        if (hat.equalsIgnoreCase("loneztar")) {
            loneztar = true;
        }
        if (hat.equalsIgnoreCase("none")) {
            birthday = false;
            christmas = false;
            halloween = false;
            easter = false;
            tnt = false;
            bear = false;
            loneztar = false;
        }
    }
    public static void iamslowpoke101() {
        birthday = false;
        christmas = false;
        halloween = false;
        easter = false;
        tnt = false;
        bear = false;
        loneztar = false;
        slowpoke = false;
        userslow = false;
        slowisplaying();
    }

}
