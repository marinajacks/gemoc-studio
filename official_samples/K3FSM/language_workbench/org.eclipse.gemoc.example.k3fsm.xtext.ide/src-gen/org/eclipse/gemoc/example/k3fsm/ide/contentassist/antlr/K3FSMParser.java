/*
 * generated by Xtext 2.12.0
 */
package org.eclipse.gemoc.example.k3fsm.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.gemoc.example.k3fsm.ide.contentassist.antlr.internal.InternalK3FSMParser;
import org.eclipse.gemoc.example.k3fsm.services.K3FSMGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class K3FSMParser extends AbstractContentAssistParser {

	@Inject
	private K3FSMGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalK3FSMParser createParser() {
		InternalK3FSMParser result = new InternalK3FSMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getFSMAccess().getGroup(), "rule__FSM__Group__0");
					put(grammarAccess.getFSMAccess().getGroup_3(), "rule__FSM__Group_3__0");
					put(grammarAccess.getFSMAccess().getGroup_4(), "rule__FSM__Group_4__0");
					put(grammarAccess.getFSMAccess().getGroup_5(), "rule__FSM__Group_5__0");
					put(grammarAccess.getFSMAccess().getGroup_8(), "rule__FSM__Group_8__0");
					put(grammarAccess.getFSMAccess().getGroup_9(), "rule__FSM__Group_9__0");
					put(grammarAccess.getFSMAccess().getGroup_10(), "rule__FSM__Group_10__0");
					put(grammarAccess.getFSMAccess().getGroup_10_3(), "rule__FSM__Group_10_3__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_4(), "rule__State__Group_4__0");
					put(grammarAccess.getStateAccess().getGroup_4_3(), "rule__State__Group_4_3__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_3(), "rule__Transition__Group_3__0");
					put(grammarAccess.getTransitionAccess().getGroup_4(), "rule__Transition__Group_4__0");
					put(grammarAccess.getFSMAccess().getNameAssignment_1(), "rule__FSM__NameAssignment_1");
					put(grammarAccess.getFSMAccess().getUnprocessedStringAssignment_3_1(), "rule__FSM__UnprocessedStringAssignment_3_1");
					put(grammarAccess.getFSMAccess().getConsummedStringAssignment_4_1(), "rule__FSM__ConsummedStringAssignment_4_1");
					put(grammarAccess.getFSMAccess().getProducedStringAssignment_5_1(), "rule__FSM__ProducedStringAssignment_5_1");
					put(grammarAccess.getFSMAccess().getInitialStateAssignment_7(), "rule__FSM__InitialStateAssignment_7");
					put(grammarAccess.getFSMAccess().getFinalStateAssignment_8_1(), "rule__FSM__FinalStateAssignment_8_1");
					put(grammarAccess.getFSMAccess().getCurrentStateAssignment_9_1(), "rule__FSM__CurrentStateAssignment_9_1");
					put(grammarAccess.getFSMAccess().getOwnedStatesAssignment_10_2(), "rule__FSM__OwnedStatesAssignment_10_2");
					put(grammarAccess.getFSMAccess().getOwnedStatesAssignment_10_3_1(), "rule__FSM__OwnedStatesAssignment_10_3_1");
					put(grammarAccess.getStateAccess().getNameAssignment_2(), "rule__State__NameAssignment_2");
					put(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_2(), "rule__State__OutgoingTransitionsAssignment_4_2");
					put(grammarAccess.getStateAccess().getOutgoingTransitionsAssignment_4_3_1(), "rule__State__OutgoingTransitionsAssignment_4_3_1");
					put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
					put(grammarAccess.getTransitionAccess().getInputAssignment_3_1(), "rule__Transition__InputAssignment_3_1");
					put(grammarAccess.getTransitionAccess().getOutputAssignment_4_1(), "rule__Transition__OutputAssignment_4_1");
					put(grammarAccess.getTransitionAccess().getTargetAssignment_6(), "rule__Transition__TargetAssignment_6");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public K3FSMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(K3FSMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}