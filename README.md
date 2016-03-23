# Android Vibrate Örneği

Android cihazlarda titreşim özelliğinin nasıl kontrol edileceğini göstermek için yazılmış kısa bir örnek uygulamasıdır.

Titreşim yetkisi için AndroidManifest.xml dosyasının içine şu satırı ekliyoruz:
```sh
<uses-permission android:name="android.permission.VIBRATE" />
```

Servisi uygulamaya dahil etmek için MainActivity.java dosyamıza şu satırları ekliyoruz:
```sh
Vibrator vibrator;
vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
```

Son olarak titreşimi tetiklememiz için çağırmamız gereken komut:
```sh
vibrator.vibrate(milisaniye);
```

### Mantık
Uygulamamızın varsayılan servislerden biri olan titreşimi kullanabilmesi için ilk olarak cihazdan bu izni almamız gerekiyor. Daha sonrasında servisi kullanmak istediğimiz activityde çağırmamız ve projeye dahil etmemiz gerekiyor. Projeye dahil edildikten sonra hangi işlemlerin sonucunda titreştirme olayını yapacak isek milisaniye cinsinden süresini belirtip o kısımda tetikliyoruz.

