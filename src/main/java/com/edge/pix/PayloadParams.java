/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edge.pix;

/**
 *
 * @author marvi
 */
public class PayloadParams {

    // Chave pix
    private String pixKey;
    // Descrição do pagamento
    private String description;
    // Nome do titular da conta
    private String merchantName;
    // Cidade do titular da conta
    private String merchantCity;
    // ID da transação do pix
    private String txid;
    // Valor do pix
    private String amount;

    public String getPixKey() {
        return pixKey;
    }

    public void setPixKey(String pixKey) {
        this.pixKey = pixKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PayloadParams{" + "pixKey=" + pixKey + ", description=" + description + ", merchantName=" + merchantName + ", merchantCity=" + merchantCity + ", txid=" + txid + ", amount=" + amount + '}';
    }

}
