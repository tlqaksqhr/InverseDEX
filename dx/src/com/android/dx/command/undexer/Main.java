package com.android.dx.command.undexer;

import com.android.dex.*;
import com.android.dex.util.Unsigned;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] argArray) throws IOException {

        File file = new File("/Users/id_manseop-pc/Desktop/AOSP/apks/imqa_loan_application2.apk");
        Dex dexFile = new Dex(file);

        for(ClassDef cdf : dexFile.classDefs()){
            System.out.println("Class Name : " + cdf.toString());
            try {
                ClassData classData = dexFile.readClassData(cdf);
                ClassData.Method[] methods = classData.allMethods();
                ClassData.Field[] fields = classData.allFields();
                /*
                for(ClassData.Method method : methods){
                    Code code = dexFile.readCode(method);
                    for(Short inst : code.getInstructions()) {
                        System.out.print(Short.toUnsignedInt(inst) + " ");
                    }
                }
                */
                for(ClassData.Field field : fields){

                }

            }catch(IllegalArgumentException e){
                System.out.println("No Code!\n");
            }

            System.out.println("===============================\n");
        }
    }
}