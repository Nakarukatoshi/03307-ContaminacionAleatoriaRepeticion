/* 
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Random;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes
        final int NUMERO_ESTACIONES = 4;
        final double NIVEL_MAX = 100;
        final double NIVEL_MIN = 0;

        //Bucle
        for (int i = 1; i < NUMERO_ESTACIONES + 1; i++) {
            //Genenra la letra
            double d = RND.nextDouble() * (NIVEL_MAX - NIVEL_MIN);

            //Salida
            System.out.printf(Locale.ENGLISH,
                    "Estación %d ...: %6.2f mcg NO2%n", i, d);
        }
    }
}
