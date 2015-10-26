package org.johnf.mydsl2.utils;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.GrammarUtil;
import org.johnf.mydsl2.services.MyDslGrammarAccess;

import com.google.inject.Inject;

public class GrammarKeywords {
	private MyDslGrammarAccess access;
	
	private final Set<String> keywords = new HashSet<String>();
	private final Set<String> punctuation = new HashSet<String>();
	
	@Inject
	public GrammarKeywords(MyDslGrammarAccess access) {
		this.access = access;
		
		Set<String> grammarKeywords = GrammarUtil.getAllKeywords(access.getGrammar());
		for (String keyword : grammarKeywords) {
			if (Character.isLetter(keyword.charAt(0))) {
				this.keywords.add(keyword);
			} else {
				this.punctuation.add(keyword);
			}
		}
	}

	public boolean isKeyword(String s) {
		return keywords.contains(s);
	}

	public boolean isPunctuation(String s) {
		return punctuation.contains(s);
	}

	public Collection<String> getPunctuation() {
		return Collections.unmodifiableCollection(punctuation);
	}

	public Collection<String> getKeywords() {
		return Collections.unmodifiableCollection(keywords);
	}
}
