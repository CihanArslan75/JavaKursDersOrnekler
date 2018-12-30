package cihan.obj.kalitim.lateBinding;

public class Motorsiklet extends Arac{
	@Override
	public void Calis(){
		System.out.println("Motorsiklet Calisiyor");
	}
	@Override
	public void YakitAl(){
		super.YakitAl();
	}
}
