package com.hawkinscomputerservices.gwt.elementprinterexamples.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Widget;
import com.hawkinscomputerservices.gwt.elementprinter.client.ElementPrinter;

public class ElementPrinterExamples extends Composite implements EntryPoint {
	private static ElementPrinterExamplesUiBinder uiBinder = GWT.create(ElementPrinterExamplesUiBinder.class);
	interface ElementPrinterExamplesUiBinder extends UiBinder<Widget, ElementPrinterExamples> {}
	
	@UiField HTMLPanel PrintFld;
	@UiField TextArea TextAreaFld;
	
	@UiHandler("PrintBtn")
	void onPrintBtnClicked(ClickEvent event) {
		ElementPrinter ep = new ElementPrinter(PrintFld.getElement());
		ep.ReplaceInputWithText();
		ep.GetPrintElement().getOwnerDocument().getElementById("ignoreRow").removeFromParent();
		ep.Print();
	}


	@Override
	public void onModuleLoad() {
		initWidget(uiBinder.createAndBindUi(this));
		TextAreaFld.setValue("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed malesuada justo eget nunc molestie sit amet pellentesque purus lobortis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Cras ac sapien eget tellus rutrum lacinia nec quis quam. Curabitur rutrum leo in orci posuere ac rhoncus magna fermentum. Integer dapibus fermentum porttitor. Curabitur scelerisque gravida dolor sed ornare. Duis eu posuere enim. Aliquam egestas dignissim turpis, vitae sagittis lorem placerat nec. Nunc magna erat, lacinia in venenatis nec, placerat vestibulum lacus. Nulla tincidunt metus orci, et sagittis turpis. Donec mi nulla, porttitor nec facilisis eu, dapibus non turpis.\n\nPellentesque tincidunt enim vitae augue venenatis iaculis. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum eget laoreet massa. Integer sit amet arcu felis. Integer ut ante erat, at gravida urna. In mattis dolor eget nunc fermentum sit amet ullamcorper nisl mollis. Ut non augue porttitor quam venenatis tempus ac id orci.\n\nMauris eu augue sapien. Ut eu velit sem. Etiam sodales nunc tempor arcu varius venenatis. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras vehicula odio vitae est pharetra vel semper neque cursus. Curabitur eget tincidunt eros. Suspendisse potenti. Donec vitae elit ut quam gravida blandit. Maecenas ullamcorper libero et lorem volutpat luctus. Donec vulputate, ligula vel tempor scelerisque, augue metus adipiscing lectus, non pretium orci nunc sit amet enim. Ut mattis magna quis tortor rutrum dignissim. Nam condimentum leo ac tellus volutpat id gravida nulla accumsan. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae;\n\nSed gravida mauris ac est ornare aliquet. Curabitur in neque ac erat dapibus tempus. Pellentesque sit amet ante sem, eu malesuada quam. Proin sit amet mauris et felis aliquet porttitor nec eget erat. Donec lacinia vulputate dui, ut lobortis magna euismod eget. Quisque sit amet augue eget felis pellentesque egestas eget ut neque. Pellentesque elit dolor, dignissim eu pharetra id, convallis a est. Phasellus sed adipiscing nisl. In hac habitasse platea dictumst. Nunc risus ante, tempor scelerisque volutpat ut, convallis at sem. Praesent varius pulvinar ullamcorper.\n\nNam non dolor massa. Nunc aliquam lacinia arcu. Cras in massa sed magna venenatis sodales sit amet a mi. Suspendisse at ante lectus. Cras et laoreet lectus. Maecenas sapien libero, elementum eu elementum at, vestibulum a erat. Vivamus magna massa, vulputate vel sodales vitae, semper sit amet libero. Fusce rhoncus blandit magna, eu venenatis enim molestie et. Maecenas quam mauris, aliquet non semper a, tristique sed purus. Phasellus dignissim sem et turpis venenatis eu suscipit lorem rutrum. Duis mauris nisl, bibendum sed malesuada sed, tincidunt ut tellus. Nulla vitae odio quam. Sed bibendum, nunc vitae bibendum vulputate, erat sapien lacinia ipsum, a luctus felis mauris id ipsum. Pellentesque in varius est. Aliquam porta aliquet nibh, eu auctor nisi vehicula vel.");
		RootLayoutPanel.get().add(this);
	}

}
