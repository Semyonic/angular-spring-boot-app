import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SaleupNotificationComponent } from './saleup-notification.component';

describe('SaleupNotificationComponent', () => {
  let component: SaleupNotificationComponent;
  let fixture: ComponentFixture<SaleupNotificationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SaleupNotificationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SaleupNotificationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
