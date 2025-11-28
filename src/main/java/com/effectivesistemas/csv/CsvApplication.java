package com.effectivesistemas.csv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.effectivesistemas.csv.presenter.CsvPresenter;

@SpringBootApplication
public class CsvApplication implements CommandLineRunner {

	private final CsvPresenter csvPresenter;

	public CsvApplication(CsvPresenter csvPresenter) {
		this.csvPresenter = csvPresenter;
	}

	public static void main(String[] args) {
		SpringApplication.run(CsvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		csvPresenter.executarProcessamento();
	}

}
