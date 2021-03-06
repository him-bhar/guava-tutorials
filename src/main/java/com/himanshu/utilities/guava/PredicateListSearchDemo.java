/*
 * Copyright 2013 Himanshu Bhardwaj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
*/
package com.himanshu.utilities.guava;

import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.himanshu.utilities.guava.demo.domain.WrapperA;

public class PredicateListSearchDemo {
	public static void main(String[] args) {
		List<WrapperA> wrapperAList = new ArrayList<WrapperA>();
		wrapperAList.add(new WrapperA("test 1"));
		wrapperAList.add(new WrapperA("test 2"));
		wrapperAList.add(new WrapperA("test 3"));
		
		List<WrapperA> matchingList = FluentIterable.<WrapperA>from(wrapperAList).filter(new Predicate<WrapperA>() {

			@Override
			public boolean apply(WrapperA arg0) {
				return "test 2".equalsIgnoreCase(arg0.getName());
			}
		}).toList();
		
		System.out.println("Wrapper A: "+wrapperAList);
		System.out.println("Matching using predicates: "+matchingList);
	}
}
