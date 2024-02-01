package kr.or.dduk.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TreatmentStatsVO {
	 private String bodyCd; // 환부 코드
	 private int treatmentCount; // 해당 환부의 치료 횟수
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM")
	 private Date clinicDt;			// 진료일시
}
