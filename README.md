# 🛗 asansör karar algoritması

## 👤 öğrenci bilgileri

| bilgi | değer |
|---|---|
| ad soyad | rüzgar v |
| numara | 0052 |
| takım | ethosoft |
| ders | bilgisayar bilimi |

---

## 1. problemin açıklaması

bu ödevde asansörün hangi kata gideceğini yapmamız istendi kullanıcı bir kat yazıyor ve asansör o kata gitmeye çalışıyor

eğer hedef kat yukardaysa yukarı çıkıyor aşağıdaysa aşağı iniyor zaten aynı kattaysa bişey yapmıyor

yanlış kat girilirse hata veriyor 100 yazarsak program kapanıyor

## 2. girdi - işlem - çıktı

### 📥 girdiler

- gitmek istediğimiz kat
- asansörün şuanki katı
- çıkmak için 100

### ⚙️ işlemler

- ilk önce girilen sayıya bakıyoruz
- 100 ise programı kapatıyoruz
- 1 ile 10 arasında değilse hata veriyoruz
- hedef kat büyükse yukarı çıkıyoruz
- hedef kat küçükse aşağı iniyoruz
- aynı kattaysa hareket etmiyoruz
- kaç kat gidileceğini hesaplıyoruz
- sonra mevcut katı değiştiriyoruz

### 📤 çıktılar

- mevcut kat
- hedef kat
- hangi yöne gideceği
- kaç kat gideceği
- işlem sonucu

---

## 3. sözde kod (pseudocode)

1. başla
2. mevcut katı 1 yap
3. kullanıcıdan kat iste
4. 100 yazarsa çık
5. kat 1 ile 10 arasında değilse hata ver
6. hedef büyükse yukarı çık
7. hedef küçükse aşağı in
8. aynıysa hareket etme
9. mesafeyi hesapla
10. mevcut katı hedef kat yap
11. tekrar kat iste
12. bitir

---

## 4. akış şeması

aşağıdaki resimde kodun nasıl çalıştığı gösterilmiştir

![akış şeması](docs/akis-semasi.png)

---

## 5. test sonuçları

| mevcut kat | hedef kat | beklenen sonuç | programın sonucu | doğru mu |
|---:|---:|---|---|:---:|
| 3 | 8 | 5 kat yukarı | 5 kat yukarı | ✅ |
| 9 | 2 | 7 kat aşağı | 7 kat aşağı | ✅ |
| 5 | 5 | hareket yok | hareket yok | ✅ |
| 1 | 10 | 9 kat yukarı | 9 kat yukarı | ✅ |
| 10 | 1 | 9 kat aşağı | 9 kat aşağı | ✅ |
| 0 | 5 | geçersiz kat | hata mesajı | ✅ |
| 5 | 11 | geçersiz kat | hata mesajı | ✅ |
| -2 | 4 | geçersiz kat | hata mesajı | ✅ |

---

Kod bozuk oldu while öğrenmediğimiz için ama iadre eder
---

## sonuç

bu ödevde if else ve while kullanmayı öğrendim ilk başta biraz karışık geldi ama deneye deneye yaptım

asansör şimdilik düzgün çalışıyor ödevde istenilenleri yapıyor
