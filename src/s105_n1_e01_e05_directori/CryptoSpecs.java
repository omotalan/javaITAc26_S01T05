package s105_n1_e01_e05_directori;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public record CryptoSpecs(SecretKey secretKey, IvParameterSpec ivSpec) {}

