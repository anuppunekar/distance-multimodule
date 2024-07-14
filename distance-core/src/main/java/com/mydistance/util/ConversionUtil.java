/*
 * Copyright 2023 .
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
package com.mydistance.util;

/**
 *
 * @author hp
 */
public class ConversionUtil {

    public double convertKMToMile(double distance){
        return (distance*0.62137);
    }
    
    public double convertkmToYard(double distance){
        return distance*1093.6;
    }

    public double convertMToMile(double distance){
        return (distance/1000)*0.62137 ;
    }

    public double convertMtoYard(double distance){
        return (distance/1000)*1093.6;
    }    

    public double fnConvertKMToM(double distance){
        return (distance*1000);
    }
}
