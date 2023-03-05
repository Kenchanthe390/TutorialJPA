package com.techacademy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // Getter・Setterを自動設定する
@AllArgsConstructor     // 全てのフィールドを引数にもつコンストラクタを自動生成する
@NoArgsConstructor      //　引数のないコンストラクタを自動生成する
@Entity                 // エンティティクラス(BDのテーブルにマッピングするクラス)であることを明示する
@Table(name="country")  // マッピング先のテーブルを明示する
public class Country {
    @Id                 // プライマリーキーであることを明示する
    private String code;
    private String name;
    private int population;
}