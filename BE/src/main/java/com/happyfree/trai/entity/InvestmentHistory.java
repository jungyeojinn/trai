package com.happyfree.trai.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.happyfree.trai.common.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InvestmentHistory extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	private String uuid;

	private String side;

	private String orderType = "LOC";

	private String price;

	private String state;

	private String market = "KRW-BTC";

	private String volume;

	private String reservedFee;

	private String executedVolume;

	private BigDecimal executedFunds;

	private BigDecimal averagePrice;

	private Integer tradesCount;

	private String orderCreatedAt;

}