package com.example.service;

import org.springframework.stereotype.Service;

import com.example.models.Response;
import com.example.models.ResponseData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FetchAPIDataImpl implements IFetchAPIData {
	public Response getResponseData() {

		Response response = new Response();

		response.setStatus("success");

		ResponseData resp = new ResponseData();

		List<String> australian = new ArrayList<>();
		australian.add("shephered");
		resp.setAustralian(australian);

		List<String> buhund = new ArrayList<>();
		buhund.add("norwegian");
		resp.setBuhund(buhund);

		List<String> bulldog = new ArrayList<>();
		bulldog.add("english");
		bulldog.add("boston");
		bulldog.add("french");
		resp.setBulldong(bulldog);

		List<String> bterrier = new ArrayList<>();
		bterrier.add("staffordshire");
		resp.setBullterrier(bterrier);

		List<String> cattledog = new ArrayList<>();
		cattledog.add("australian");
		resp.setCattledog(cattledog);

		String[] arr = { "american", "australian", "bedlington", "border", "cairn", "dandie", "fox", "irish",
				"kerryblue", "lakeland", "norfolk", "norwich", "patterdale", "russell", "scottish", "sealyham", "silky",
				"tibetan", "toy", "westhighland", "wheaten", "yorkshire" };
		resp.setTerrier(Arrays.asList(arr));

		String[] arr1 = { "blenheim", "brittany", "cocker", "irish", "japanese", "sussex", "welsh" };
		resp.setSpaniel(Arrays.asList(arr1));

		String[] arr2 = { "spanish" };

		resp.setWaterdog(Arrays.asList(arr2));

		String[] arr3 = { "english", "shetland" };
		resp.setSheepdog(Arrays.asList(arr3));

		String[] arr4 = { "giant", "miniature" };

		resp.setSchnauzer(Arrays.asList(arr4));

		String[] arr5 = { "chesapeake", "curly", "flatcoated", "golden" };
		resp.setRetriever(Arrays.asList(arr5));

		String[] arr6 = { "miniature", "standard", "toy" };
		resp.setPoodle(Arrays.asList(arr6));

		String[] arr7 = { "irish" };
		resp.setWolfhound(Arrays.asList(arr7));

		response.setMessage(resp);

		return response;

	}
}
