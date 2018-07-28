import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { NavbarComponent } from './components/navbar/navbar.component';
import { OptionsComponent } from './components/options/options.component';
import { PopupComponent } from './components/popup/popup.component';
import { FooterComponent } from './components/footer/footer.component';
import { CookiesNotificationComponent } from './components/cookies-notification/cookies-notification.component';
import { SliderComponent } from './components/slider/slider.component';
import { HeaderComponent } from './components/header/header.component';
import { SaleupNotificationComponent } from './components/saleup-notification/saleup-notification.component';
import { SearchComponent } from './components/search/search.component';
import { ProductComponent } from './components/product/product.component';
import { SubscribeComponent } from './components/subscribe/subscribe.component';
import { HomeComponent } from './home/home.component';
import { DetailComponent } from './detail/detail.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RecoverComponent } from './recover/recover.component';

@NgModule({
   declarations: [
      AppComponent,
      NavbarComponent,
      OptionsComponent,
      PopupComponent,
      FooterComponent,
      CookiesNotificationComponent,
      SliderComponent,
      HeaderComponent,
      SaleupNotificationComponent,
      SearchComponent,
      ProductComponent,
      SubscribeComponent,
      HomeComponent,
      DetailComponent,
      LoginComponent,
      RegisterComponent,
      RecoverComponent
   ],
   imports: [
      BrowserModule,
      FormsModule,
      AppRoutingModule,
      HttpClientModule
   ],
   providers: [],
   bootstrap: [
      AppComponent
   ]
})
export class AppModule { }
