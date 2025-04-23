package com.example.demo.model;

import lombok.Data;

@Data
public class InquiryForm{
	
/**
 * 受付日時
 */
private String recdt;

/**
 * 受付番号
 */
private String recno;

/**
 * 名前
 */
private String name;

/**
 * メールアドレス
 */
private String mail;

/**
 * 年齢
 */
private Integer age;

/**
 * 性別
 */
private String gender;

}