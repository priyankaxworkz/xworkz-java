package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.List;

public class Country {

	public static void main(String[] args) {
		
		List<String> countryList= new ArrayList<>();
		
		countryList.add("india");
		countryList.add("pakistan");
		countryList.add("china");
		countryList.add("afghanistan");
		countryList.add("albania");
		countryList.add("algeria");
		countryList.add("andorra");
		countryList.add("angola");
		countryList.add("argentina");
		countryList.add("armenia");
		countryList.add("austrlia");
		countryList.add("austria");
		countryList.add("azerbijan");
		countryList.add("bangladesh");
		countryList.add("baden");
		countryList.add("bahrain");
		countryList.add("barbados");
		countryList.add("belarus");
		countryList.add("belgium");
		countryList.add("belize");
		countryList.add("benin");
		countryList.add("bolivia");
		countryList.add("brazil");
		countryList.add("botswana");
		countryList.add("bulgaria");
		countryList.add("burundi");
		countryList.add("burma");
		countryList.add("cabo verde");
		countryList.add("cambodia");
		countryList.add("cameroon");
		countryList.add("canada");
		countryList.add("chad");
		countryList.add("chile");
		countryList.add("colombia");
		countryList.add("comoros");
		countryList.add("costa rica");
		countryList.add("croatia");
		countryList.add("cuba");
		countryList.add("cyprus");
		countryList.add("czechila");
		countryList.add("denmark");
		countryList.add("dominica");
		countryList.add("djibouti");
		countryList.add("egypt");
		countryList.add("ecudor");
		countryList.add("eritrea");
		countryList.add("estonia");
		countryList.add("estwatini");
		countryList.add("ethiopia");
		countryList.add("eastgremany");
		countryList.add("el salvador");
		countryList.add("fiji");
		countryList.add("finland");
		countryList.add("france");
		countryList.add("gadon");
		countryList.add("gambia");
		countryList.add("gerogia");
		countryList.add("germany");
		countryList.add("ghana");
		countryList.add("grrece");
		countryList.add("grenada");
		countryList.add("guatemala");
		countryList.add("guinea");
		countryList.add("guyana");
		countryList.add("haiti");
		countryList.add("hanover");
		countryList.add("hawaii");
		countryList.add("hesse");
		countryList.add("holy see");
		countryList.add("hondrus");
		countryList.add("hungary");
		countryList.add("iceland");
		countryList.add("indonesia");
		countryList.add("iran");
		countryList.add("iraq");
		countryList.add("ireland");
		countryList.add("israel");
		countryList.add("italy");
		countryList.add("jamacia");
		countryList.add("japan");
		countryList.add("jordan");
		countryList.add("kazakistan");
		countryList.add("kenya");
		countryList.add("kiribati");
		countryList.add("korea");
		countryList.add("kosova");
		countryList.add("kuwait");
		countryList.add("kyrgyzstan");
		countryList.add("laos");
		countryList.add("latvia");
		countryList.add("lbanon");
		countryList.add("lesotho");
		countryList.add("liberia");
		countryList.add("libya");
		countryList.add("lithuaina");
		countryList.add("malawai");
		countryList.add("maldives");
		countryList.add("malta");
		countryList.add("mexico");
		countryList.add("nepal");
		
		//System.out.println(countryList);
		
		System.out.println("size is:"+countryList.size());
		
		
		for(String name:countryList) {
			System.out.println(name);
		}
		
		System.out.println(countryList.subList(30,90));
	}
}
