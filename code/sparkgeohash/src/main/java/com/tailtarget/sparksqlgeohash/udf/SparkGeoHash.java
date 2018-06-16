package com.tailtarget.sparksqlgeohash.udf;

import ch.hsr.geohash.GeoHash;
import org.apache.spark.sql.api.java.UDF3;

/**
 * @author babadopulos
 */
public class SparkGeoHash implements UDF3<Double, Double, Integer, String> {


    public String call(Double latitude, Double longitude, Integer numberOfCharacters){

        return GeoHash.withCharacterPrecision(latitude, longitude, numberOfCharacters).toBase32();
    }
}
