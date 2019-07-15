package cn.kvtse.study.designer.structure.bridge;

/**
 * 桥接模式
 *  在桥接模式的情形下,改变了继承层次的,如果后续需要继续增加品牌或者样式的时候
 *  都只需要对应的去增加具体的实现即可.
 *  如本例中:如果需要增加HuaWei品牌手机,只需增加HuaWei类,继承Brand,实现其方法即可.
 *  如果想增加手机的样式,只需增加对应的样式如StraightPhone继承于AbstractPhoneStyle
 *  这样就不会形成类爆炸的形式.
 * @author Tsing Tse
 * @date 2019-07-14 15:23
 */
public class Client {
    public static void main(String[] args) {
        AbstractPhoneStyle foldedPhone = new FoldedPhone(new Vivo());
        foldedPhone.open();
        foldedPhone.call();
        foldedPhone.close();

        AbstractPhoneStyle foldedPhone2 = new StraightPhone(new HuaWei());
        foldedPhone2.open();
        foldedPhone2.call();
        foldedPhone2.close();


    }

}
