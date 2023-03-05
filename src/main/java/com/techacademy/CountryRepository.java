package com.techacademy;

import org.springframework.data.jpa.repository.JpaRepository;

// リポジトリクラスには、@Repositoryアノテーションを付ける必要があるが、JpaRepositoryインタフェースを継承した場合には省略可能
public interface CountryRepository extends JpaRepository<Country, String> {

}