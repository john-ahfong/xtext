/*
 * generated by Xtext
 */
package org.johnf.mydsl1.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWorkspaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cDataTypesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cDataTypesEntityParserRuleCall_4_0 = (RuleCall)cDataTypesAssignment_4.eContents().get(0);
		private final Assignment cSystemsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSystemsSystemParserRuleCall_5_0 = (RuleCall)cSystemsAssignment_5.eContents().get(0);
		
		//Model:
		//	"workspace" name=ID ";" ("description" description=STRING ";")? dataTypes+=Entity* systems+=System*;
		@Override public ParserRule getRule() { return rule; }

		//"workspace" name=ID ";" ("description" description=STRING ";")? dataTypes+=Entity* systems+=System*
		public Group getGroup() { return cGroup; }

		//"workspace"
		public Keyword getWorkspaceKeyword_0() { return cWorkspaceKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }

		//("description" description=STRING ";")?
		public Group getGroup_3() { return cGroup_3; }

		//"description"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//dataTypes+=Entity*
		public Assignment getDataTypesAssignment_4() { return cDataTypesAssignment_4; }

		//Entity
		public RuleCall getDataTypesEntityParserRuleCall_4_0() { return cDataTypesEntityParserRuleCall_4_0; }

		//systems+=System*
		public Assignment getSystemsAssignment_5() { return cSystemsAssignment_5; }

		//System
		public RuleCall getSystemsSystemParserRuleCall_5_0() { return cSystemsSystemParserRuleCall_5_0; }
	}

	public class SystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "System");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSystemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cImportsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cImportsDefinitionImportParserRuleCall_4_0 = (RuleCall)cImportsAssignment_4.eContents().get(0);
		private final Assignment cDataTypesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDataTypesEntityParserRuleCall_5_0 = (RuleCall)cDataTypesAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//System:
		//	"system" name=ID "{" ("description" description=STRING ";")? imports+=DefinitionImport* dataTypes+=Entity* "}";
		@Override public ParserRule getRule() { return rule; }

		//"system" name=ID "{" ("description" description=STRING ";")? imports+=DefinitionImport* dataTypes+=Entity* "}"
		public Group getGroup() { return cGroup; }

		//"system"
		public Keyword getSystemKeyword_0() { return cSystemKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("description" description=STRING ";")?
		public Group getGroup_3() { return cGroup_3; }

		//"description"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//imports+=DefinitionImport*
		public Assignment getImportsAssignment_4() { return cImportsAssignment_4; }

		//DefinitionImport
		public RuleCall getImportsDefinitionImportParserRuleCall_4_0() { return cImportsDefinitionImportParserRuleCall_4_0; }

		//dataTypes+=Entity*
		public Assignment getDataTypesAssignment_5() { return cDataTypesAssignment_5; }

		//Entity
		public RuleCall getDataTypesEntityParserRuleCall_5_0() { return cDataTypesEntityParserRuleCall_5_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class DefinitionImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DefinitionImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cDefinitionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cDefinitionDefinitionCrossReference_1_0 = (CrossReference)cDefinitionAssignment_1.eContents().get(0);
		private final RuleCall cDefinitionDefinitionFQNParserRuleCall_1_0_1 = (RuleCall)cDefinitionDefinitionCrossReference_1_0.eContents().get(1);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//DefinitionImport:
		//	"import" definition=[Definition|FQN] ";";
		@Override public ParserRule getRule() { return rule; }

		//"import" definition=[Definition|FQN] ";"
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//definition=[Definition|FQN]
		public Assignment getDefinitionAssignment_1() { return cDefinitionAssignment_1; }

		//[Definition|FQN]
		public CrossReference getDefinitionDefinitionCrossReference_1_0() { return cDefinitionDefinitionCrossReference_1_0; }

		//FQN
		public RuleCall getDefinitionDefinitionFQNParserRuleCall_1_0_1() { return cDefinitionDefinitionFQNParserRuleCall_1_0_1; }

		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}

	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Definition");
		private final RuleCall cDataTypeParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Definition:
		//	DataType;
		@Override public ParserRule getRule() { return rule; }

		//DataType
		public RuleCall getDataTypeParserRuleCall() { return cDataTypeParserRuleCall; }
	}

	public class PartitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Partition");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cModelParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSystemParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Partition:
		//	Model | System;
		@Override public ParserRule getRule() { return rule; }

		//Model | System
		public Alternatives getAlternatives() { return cAlternatives; }

		//Model
		public RuleCall getModelParserRuleCall_0() { return cModelParserRuleCall_0; }

		//System
		public RuleCall getSystemParserRuleCall_1() { return cSystemParserRuleCall_1; }
	}

	public class CrossReferenceTargetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "CrossReferenceTarget");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefinitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFieldParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//CrossReferenceTarget:
		//	Definition | Field;
		@Override public ParserRule getRule() { return rule; }

		//Definition | Field
		public Alternatives getAlternatives() { return cAlternatives; }

		//Definition
		public RuleCall getDefinitionParserRuleCall_0() { return cDefinitionParserRuleCall_0; }

		//Field
		public RuleCall getFieldParserRuleCall_1() { return cFieldParserRuleCall_1; }
	}

	public class FQNElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "FQN");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//// fully qualified name
		//FQN:
		//	ID ("." ID)*;
		@Override public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBuiltInTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		////
		//// Data Types
		////
		//DataType:
		//	BuiltInType | Entity;
		@Override public ParserRule getRule() { return rule; }

		//BuiltInType | Entity
		public Alternatives getAlternatives() { return cAlternatives; }

		//BuiltInType
		public RuleCall getBuiltInTypeParserRuleCall_0() { return cBuiltInTypeParserRuleCall_0; }

		//Entity
		public RuleCall getEntityParserRuleCall_1() { return cEntityParserRuleCall_1; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cDescriptionKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cDescriptionAssignment_3_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Assignment cFieldsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cFieldsFieldParserRuleCall_4_0 = (RuleCall)cFieldsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity:
		//	"entity" name=ID "{" ("description" description=STRING ";")? fields+=Field* // MULTI-VALIDATION warn if fields.size==0
		//	"}";
		@Override public ParserRule getRule() { return rule; }

		//"entity" name=ID "{" ("description" description=STRING ";")? fields+=Field* // MULTI-VALIDATION warn if fields.size==0
		//"}"
		public Group getGroup() { return cGroup; }

		//"entity"
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }

		//("description" description=STRING ";")?
		public Group getGroup_3() { return cGroup_3; }

		//"description"
		public Keyword getDescriptionKeyword_3_0() { return cDescriptionKeyword_3_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_1() { return cDescriptionAssignment_3_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_1_0; }

		//";"
		public Keyword getSemicolonKeyword_3_2() { return cSemicolonKeyword_3_2; }

		//fields+=Field*
		public Assignment getFieldsAssignment_4() { return cFieldsAssignment_4; }

		//Field
		public RuleCall getFieldsFieldParserRuleCall_4_0() { return cFieldsFieldParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class BuiltInTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BuiltInType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_1_0 = (RuleCall)cDescriptionAssignment_1.eContents().get(0);
		
		//// Only instantiated "behind the scenes", i.e. no keyword, not called as a rule
		//BuiltInType:
		//	name=ID description=STRING;
		@Override public ParserRule getRule() { return rule; }

		//name=ID description=STRING
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_1() { return cDescriptionAssignment_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_1_0() { return cDescriptionSTRINGTerminalRuleCall_1_0; }
	}

	public class FieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Field");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTypeDataTypeCrossReference_2_0 = (CrossReference)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeDataTypeFQNParserRuleCall_2_0_1 = (RuleCall)cTypeDataTypeCrossReference_2_0.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Group cGroup_3_0_0 = (Group)cGroup_3_0.eContents().get(0);
		private final Keyword cDescriptionKeyword_3_0_0_0 = (Keyword)cGroup_3_0_0.eContents().get(0);
		private final Assignment cDescriptionAssignment_3_0_0_1 = (Assignment)cGroup_3_0_0.eContents().get(1);
		private final RuleCall cDescriptionSTRINGTerminalRuleCall_3_0_0_1_0 = (RuleCall)cDescriptionAssignment_3_0_0_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_3_0_0_2 = (Keyword)cGroup_3_0_0.eContents().get(2);
		private final Group cGroup_3_0_1 = (Group)cGroup_3_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_3_0_1_0 = (Keyword)cGroup_3_0_1.eContents().get(0);
		private final Assignment cLowerAssignment_3_0_1_1 = (Assignment)cGroup_3_0_1.eContents().get(1);
		private final RuleCall cLowerINTTerminalRuleCall_3_0_1_1_0 = (RuleCall)cLowerAssignment_3_0_1_1.eContents().get(0);
		private final Keyword cCommaKeyword_3_0_1_2 = (Keyword)cGroup_3_0_1.eContents().get(2);
		private final Alternatives cAlternatives_3_0_1_3 = (Alternatives)cGroup_3_0_1.eContents().get(3);
		private final Assignment cUpperUnlimitedAssignment_3_0_1_3_0 = (Assignment)cAlternatives_3_0_1_3.eContents().get(0);
		private final Keyword cUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0 = (Keyword)cUpperUnlimitedAssignment_3_0_1_3_0.eContents().get(0);
		private final Assignment cUpperAssignment_3_0_1_3_1 = (Assignment)cAlternatives_3_0_1_3.eContents().get(1);
		private final RuleCall cUpperINTTerminalRuleCall_3_0_1_3_1_0 = (RuleCall)cUpperAssignment_3_0_1_3_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_0_1_4 = (Keyword)cGroup_3_0_1.eContents().get(4);
		private final Keyword cSemicolonKeyword_3_0_1_5 = (Keyword)cGroup_3_0_1.eContents().get(5);
		private final Keyword cSemicolonKeyword_3_1 = (Keyword)cAlternatives_3.eContents().get(1);
		
		//Field:
		//	name=ID ":" type=[DataType|FQN] (("description" description=STRING ";")? ("[" lower=INT "," (upperUnlimited?="*" |
		//	upper=INT) "]" ";")? // default values: lower=1 and upper=1 set via PostProcessor
		//	| ";");
		@Override public ParserRule getRule() { return rule; }

		//name=ID ":" type=[DataType|FQN] (("description" description=STRING ";")? ("[" lower=INT "," (upperUnlimited?="*" |
		//upper=INT) "]" ";")? // default values: lower=1 and upper=1 set via PostProcessor
		//| ";")
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=[DataType|FQN]
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//[DataType|FQN]
		public CrossReference getTypeDataTypeCrossReference_2_0() { return cTypeDataTypeCrossReference_2_0; }

		//FQN
		public RuleCall getTypeDataTypeFQNParserRuleCall_2_0_1() { return cTypeDataTypeFQNParserRuleCall_2_0_1; }

		//("description" description=STRING ";")? ("[" lower=INT "," (upperUnlimited?="*" | upper=INT) "]" ";")? // default values: lower=1 and upper=1 set via PostProcessor
		//| ";"
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//("description" description=STRING ";")? ("[" lower=INT "," (upperUnlimited?="*" | upper=INT) "]" ";")?
		public Group getGroup_3_0() { return cGroup_3_0; }

		//("description" description=STRING ";")?
		public Group getGroup_3_0_0() { return cGroup_3_0_0; }

		//"description"
		public Keyword getDescriptionKeyword_3_0_0_0() { return cDescriptionKeyword_3_0_0_0; }

		//description=STRING
		public Assignment getDescriptionAssignment_3_0_0_1() { return cDescriptionAssignment_3_0_0_1; }

		//STRING
		public RuleCall getDescriptionSTRINGTerminalRuleCall_3_0_0_1_0() { return cDescriptionSTRINGTerminalRuleCall_3_0_0_1_0; }

		//";"
		public Keyword getSemicolonKeyword_3_0_0_2() { return cSemicolonKeyword_3_0_0_2; }

		//("[" lower=INT "," (upperUnlimited?="*" | upper=INT) "]" ";")?
		public Group getGroup_3_0_1() { return cGroup_3_0_1; }

		//"["
		public Keyword getLeftSquareBracketKeyword_3_0_1_0() { return cLeftSquareBracketKeyword_3_0_1_0; }

		//lower=INT
		public Assignment getLowerAssignment_3_0_1_1() { return cLowerAssignment_3_0_1_1; }

		//INT
		public RuleCall getLowerINTTerminalRuleCall_3_0_1_1_0() { return cLowerINTTerminalRuleCall_3_0_1_1_0; }

		//","
		public Keyword getCommaKeyword_3_0_1_2() { return cCommaKeyword_3_0_1_2; }

		//upperUnlimited?="*" | upper=INT
		public Alternatives getAlternatives_3_0_1_3() { return cAlternatives_3_0_1_3; }

		//upperUnlimited?="*"
		public Assignment getUpperUnlimitedAssignment_3_0_1_3_0() { return cUpperUnlimitedAssignment_3_0_1_3_0; }

		//"*"
		public Keyword getUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0() { return cUpperUnlimitedAsteriskKeyword_3_0_1_3_0_0; }

		//upper=INT
		public Assignment getUpperAssignment_3_0_1_3_1() { return cUpperAssignment_3_0_1_3_1; }

		//INT
		public RuleCall getUpperINTTerminalRuleCall_3_0_1_3_1_0() { return cUpperINTTerminalRuleCall_3_0_1_3_1_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_3_0_1_4() { return cRightSquareBracketKeyword_3_0_1_4; }

		//";"
		public Keyword getSemicolonKeyword_3_0_1_5() { return cSemicolonKeyword_3_0_1_5; }

		//";"
		public Keyword getSemicolonKeyword_3_1() { return cSemicolonKeyword_3_1; }
	}
	
	
	private final ModelElements pModel;
	private final SystemElements pSystem;
	private final DefinitionImportElements pDefinitionImport;
	private final DefinitionElements pDefinition;
	private final PartitionElements pPartition;
	private final CrossReferenceTargetElements pCrossReferenceTarget;
	private final TerminalRule tDATE;
	private final TerminalRule tINT;
	private final TerminalRule tDECIMAL;
	private final FQNElements pFQN;
	private final DataTypeElements pDataType;
	private final EntityElements pEntity;
	private final BuiltInTypeElements pBuiltInType;
	private final FieldElements pField;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSystem = new SystemElements();
		this.pDefinitionImport = new DefinitionImportElements();
		this.pDefinition = new DefinitionElements();
		this.pPartition = new PartitionElements();
		this.pCrossReferenceTarget = new CrossReferenceTargetElements();
		this.tDATE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DATE");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT");
		this.tDECIMAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "DECIMAL");
		this.pFQN = new FQNElements();
		this.pDataType = new DataTypeElements();
		this.pEntity = new EntityElements();
		this.pBuiltInType = new BuiltInTypeElements();
		this.pField = new FieldElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.johnf.mydsl1.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	"workspace" name=ID ";" ("description" description=STRING ";")? dataTypes+=Entity* systems+=System*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//System:
	//	"system" name=ID "{" ("description" description=STRING ";")? imports+=DefinitionImport* dataTypes+=Entity* "}";
	public SystemElements getSystemAccess() {
		return pSystem;
	}
	
	public ParserRule getSystemRule() {
		return getSystemAccess().getRule();
	}

	//DefinitionImport:
	//	"import" definition=[Definition|FQN] ";";
	public DefinitionImportElements getDefinitionImportAccess() {
		return pDefinitionImport;
	}
	
	public ParserRule getDefinitionImportRule() {
		return getDefinitionImportAccess().getRule();
	}

	//Definition:
	//	DataType;
	public DefinitionElements getDefinitionAccess() {
		return pDefinition;
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}

	//Partition:
	//	Model | System;
	public PartitionElements getPartitionAccess() {
		return pPartition;
	}
	
	public ParserRule getPartitionRule() {
		return getPartitionAccess().getRule();
	}

	//CrossReferenceTarget:
	//	Definition | Field;
	public CrossReferenceTargetElements getCrossReferenceTargetAccess() {
		return pCrossReferenceTarget;
	}
	
	public ParserRule getCrossReferenceTargetRule() {
		return getCrossReferenceTargetAccess().getRule();
	}

	//terminal DATE returns ecore::EDate:
	//	"0".."9" "0".."9" "0".."9" "0".."9" "-" "0".."9" "0".."9" "-" "0".."9" "0".."9";
	public TerminalRule getDATERule() {
		return tDATE;
	} 

	//terminal INT returns ecore::EInt:
	//	"-"? "0".."9"+;
	public TerminalRule getINTRule() {
		return tINT;
	} 

	//terminal DECIMAL returns ecore::EBigDecimal:
	//	"-"? "0".."9"+ "." "0".."9"+;
	public TerminalRule getDECIMALRule() {
		return tDECIMAL;
	} 

	//// fully qualified name
	//FQN:
	//	ID ("." ID)*;
	public FQNElements getFQNAccess() {
		return pFQN;
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
	}

	////
	//// Data Types
	////
	//DataType:
	//	BuiltInType | Entity;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}

	//Entity:
	//	"entity" name=ID "{" ("description" description=STRING ";")? fields+=Field* // MULTI-VALIDATION warn if fields.size==0
	//	"}";
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//// Only instantiated "behind the scenes", i.e. no keyword, not called as a rule
	//BuiltInType:
	//	name=ID description=STRING;
	public BuiltInTypeElements getBuiltInTypeAccess() {
		return pBuiltInType;
	}
	
	public ParserRule getBuiltInTypeRule() {
		return getBuiltInTypeAccess().getRule();
	}

	//Field:
	//	name=ID ":" type=[DataType|FQN] (("description" description=STRING ";")? ("[" lower=INT "," (upperUnlimited?="*" |
	//	upper=INT) "]" ";")? // default values: lower=1 and upper=1 set via PostProcessor
	//	| ";");
	public FieldElements getFieldAccess() {
		return pField;
	}
	
	public ParserRule getFieldRule() {
		return getFieldAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
