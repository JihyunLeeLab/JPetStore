package com.example.jpetstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.jpetstore.domain.Item;

@Controller
public class SellController {
	/*테스트용 컨트롤러 입니다.*/
	
	
	
	@RequestMapping("/shop/SellCategory.do")
	public String showSellCat() {
		return "SellCategory";
	}
	
	@RequestMapping("/shop/generalForm.do")
	public String showGeneralForm() {
		return "GeneralSellForm";
	}
	
	@RequestMapping("/shop/auctionForm.do")
	public String showAuctionForm() {
		return "AuctionSellForm";
	}
	
	@RequestMapping("/shop/blackList.do")
	public String blackListForm() {
		return "BlackListForm";
	}

	
	@RequestMapping("/shop/partInAuction.do")
	public String partAuction() {
		return "PartInAuction";
	}
	
	@RequestMapping("/shop/goBack.do")
	public String goBack() {

		return "AuctionItem";
	}
	
}
