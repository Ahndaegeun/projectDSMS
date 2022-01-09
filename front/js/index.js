$('').on('click', function() {})

// Global Variable


// Page Transform
$('.login .search-info-link').on('click', function() {
  $('.login').addClass('main-view-hidden')
  $('.search-info').removeClass('main-view-hidden')
  $('.login-side-bar').addClass('show-btn')
  $('.side-bar-btn-group > button').removeClass('side-bar-btn-hidden')
  $('.side-bar-btn-group .search-info-link').addClass('side-bar-btn-hidden')
})

$('.login .sign-up-link').on('click', function() {
  $('.login').addClass('main-view-hidden')
  $('.sign-up').removeClass('main-view-hidden')
  $('.login-side-bar').addClass('show-btn')
  $('.side-bar-btn-group > button').removeClass('side-bar-btn-hidden')
  $('.side-bar-btn-group .sign-up-link').addClass('side-bar-btn-hidden')
})

// Login Page
$('.login-btn').on('click', function() {
  const currentData = {
    id : $('#login-id').val().trim(),
    pw : $('#login-pw').val().trim()
  }
  
  if(currentData.id !== "" && currentData.pw !== "") {
    $.ajax({
      url: '/',
      data: currentData,
      method: 'post',
      success: function(res) {
        console.log(res)
      },
      error: function(e) {
        console.log(e)
      }
    })
  } else {
    $('.login-text').html('아이디, 비밀번호를 입력해 주세요').css('color', 'red')
  }
})

// Side bar Login Click
$('.side-bar-btn-group .login-link').on('click', function() {
  $('.login').removeClass('main-view-hidden')
  $('.search-info').addClass('main-view-hidden')
  $('.sign-up').addClass('main-view-hidden')
  $('.login-side-bar').removeClass('show-btn')
  $('.side-bar-btn-group > button').addClass('side-bar-btn-hidden')
})

// Sign up Page
$('.side-bar-btn-group .search-info-link').on('click', function() {
  $('.login-side-bar .search-info-link').addClass('side-bar-btn-hidden')
  $('.login-side-bar .sign-up-link').removeClass('side-bar-btn-hidden')
  $('.sign-up').addClass('main-view-hidden')
  $('.search-info').removeClass('main-view-hidden')
})

$('.sign-up-btn').on('click', function() {
  const currentData = {
    id: $('#sign-up-id').val().trim(),
    pw: $('#sign-up-pw').val().trim(),
    pwck: $('#sign-up-pw-ck').val().trim(),
    name: $('#sign-up-name').val().trim(),
    regno: $('#sign-up-reg-no').val().trim(),
    tel: $('#sign-up-phone').val().trim(),
    license: $('#sign-up-license').val().trim(),
    division: $('[id^="sign-up-job"]'),
    email: $('#sign-up-email').val().trim()
  }
  const queryStr = $('#sign-up-frm').serialize()

  if(currentData.id !== "" &&
    currentData.pw !== "" &&
    currentData.pwck !== "" &&
    currentData.name !== "" &&
    currentData.regno !== "" &&
    currentData.tel !== "" &&
    currentData.license !== "" &&
    currentData.division !== "" &&
    currentData.email !== "") {
      $.ajax({
        url: "/",
        data: queryStr,
        method: 'post',
        success: function(res) {
          console.log(res)
        },
        error: function(e) {
          console.log(e)
        }
      })
    } else {
      alert('모든 항목을 입력해 주세요.')
    }
})

$('#sign-up-id').on('keyup', function() {
  const userId = $('#sign-up-id').val()
  const text = $('.sign-up-id-text')
  const reg = /^[a-z]+[a-z0-9]{6,20}$/g
  const icon = $('.id-icon-wrap img')

  if(userId === "") {
    text.html('아이디는 6~20자 영어와 숫자를 조합해야 합니다.').css('color', 'black')
    icon.attr('src', '../storage/img/ckIcon.png')
  } else if(reg.test(userId)) {
    $.ajax({
      url: "/",
      data: {id: userId},
      method: 'post',
      success: function(res) {
        console.log(res)
        icon.attr('src', '../storage/img/ckIconOk.png')
      },
      error: function(e) {
        console.log(e)
      }
    })
  } else {
    text.html('형식에 맞게 입력해 주세요').css('color', 'red')
    icon.attr('src', '../storage/img/ckIconRed.png')
  }
})

$('#sign-up-pw').on('keyup', function() {
  const userPw = $('#sign-up-pw').val()
  const text = $('.sign-up-pw-text')
  const reg = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[$@$!%*#?&])[A-Za-z\d$@$!%*#?&]{8,20}$/g
  const icon = $('.pw-icon-wrap img')

  if(userPw === "") {
    text.html('비밀번호는 8~20자 영어, 숫자, 특수문자를 조합해야 합니다.').css('color', 'black')
    icon.attr('src', '../storage/img/ckIcon.png')
  } else if(reg.test(userPw)) {
    text.html('사용 가능한 비밀번호 입니다.').css('color', 'black')
    icon.attr('src', '../storage/img/ckIconOk.png')
  } else {
    text.html('형식에 맞게 입력해 주세요').css('color', 'red')
    icon.attr('src', '../storage/img/ckIconRed.png')
  }
})

$('#sign-up-pw-ck').on('keyup', function() {
  const userPw = $('#sign-up-pw-ck').val()
  const text = $('.sign-up-pw-ck-text')
  const reg = $('#sign-up-pw').val()
  const icon = $('.pw-ck-icon-wrap img')

  if(userPw === "") {
    text.html('비밀번호를 한번 더 입력해 주세요.').css('color', 'black')
    icon.attr('src', '../storage/img/ckIcon.png')
  } else if(reg === userPw) {
    text.html('일치 합니다.').css('color', 'black')
    icon.attr('src', '../storage/img/ckIconOk.png')
  } else {
    text.html('비밀번호가 일치하지 않습니다.').css('color', 'red')
    icon.attr('src', '../storage/img/ckIconRed.png')
  }
})

$('#sign-up-name').on('keyup', function() {
  const userName = $('#sign-up-name').val()
  const text = $('.sign-up-name-text')
  const reg = /^[가-힣]{2,10}$/

  if(userName === "") {
    text.html('이름을 입력해 주세요.').css('color', 'black')
  } else if(reg.test(userName)) {
    text.html('')
  } else {
    text.html('이름을 정확히 입력해 주세요').css('color', 'red')
  }
})

$('#sign-up-reg-no').on('keyup', function() {
  const userReg = $('#sign-up-reg-no').val()
  const text = $('.sign-up-reg-no-text')
  const reg = /^(?:[0-9]{2}(?:0[1-9]|1[0-2])(?:0[1-9]|[1,2][0-9]|3[0,1]))[1-4][0-9]{6}$/

  if(userReg === "") {
    text.html('\'-\'을 제외한 주민번호를 입력해 주세요').css('color', 'black')
  } else if(reg.test(userReg)) {
    $.ajax({
      url: "/",
      data: {
        name: $('#sign-up-name').val(),
        regNo: userReg
      },
      method: 'post',
      success: function(res) {
        console.log(res)
      },
      error: function(e) {
        console.log(e)
      }
    })
  } else {
    text.html('주민번호를 정확히 입력해 주세요').css('color', 'red')
  }
})

$('#sign-up-phone').on('keyup', function() {
  const userPhone = $('#sign-up-phone').val()
  const text = $('.sign-up-phone-text')
  const reg = /^\d{3}\d{4}\d{4}$/
  const icon = $('.phone-icon-wrap img')

  if(userPhone === "") {
    text.html("'-'을 제외한 전화번호를 입력해 주세요").css('color', 'black')
    icon.attr('src', '../storage/img/ckIcon.png')
  } else if(reg.test(userPhone)) {
    $.ajax({
      url: "/",
      data: {phone: userPhone},
      method: "post",
      success: function(res) {
        console.log(res)

        // 핸드폰 번호 중복이 없으면
        text.html('문자 인증을 진행해 주세요.').css('color', 'black')
        icon.attr('src', '../storage/img/ckIconOk.png')
      },
      error: function(e) {
        console.log(e)
      }
    })
  } else {
    text.html('전화번호 형식에 맞게 입력해 주세요.').css('color', 'red')
    icon.attr('src', '../storage/img/ckIconRed.png')
  }
})

$('.send-license').on('click', function() {
  const phoneNum = $('#sign-up-phone').val()
  const text = $('.sign-up-license-text')

  if(phoneNum !== "") {
    $.ajax({
      url: '/',
      data: phoneNum,
      method: 'post',
      success: function(res) {
        console.log(res)
        $('.send-license').addClass('hidden')
        $('.ck-license').removeClass('hidden')
      },
      error: function(e) {
        console.log(e)
      }
    })
  } else {
    text.html('핸드폰 번호을 입력해 주세요.').css('color', 'red')
  }
})

$('.ck-license').on('click', function() {
  const license = $('#sign-up-license').val()
  const text = $('.sign-up-license-text')

  $.ajax({
    url: '/',
    data: license,
    method: 'post',
    success: function(res) {
      console.log(res)

      if(res === true) {
        text.html('인증이 완료되었습니다.').css('color', 'black')
        $('.ck-license').addClass('hidden')
        $('.license-icon-wrap img').removeClass('hidden')
      } else {
        text.html('잘못 입력하셨습니다.').css('color', 'red')
      }
    },
    error: function(e) {
      console.log(e)
    }
  })
})

$('#sign-up-email').on('keyup', function() {
  const userEmail = $('#sign-up-email').val()
  const text = $('.sign-up-email-text')
  const reg = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i
  const icon = $('.email-icon-wrap img')
  signFlag = false

  if(userEmail === "") {
    text.html('이메일을 입력해 주세요.').css('color', 'black')
    icon.attr('src', '../storage/img/ckIcon.png')
  } else if(reg.test(userEmail)) {
    $.ajax({
      url: "/",
      data: {email: userEmail},
      method: "post",
      success: function(res) {
        console.log(res)

        // 중복 이메일 없을시
        text.html('일치 합니다.').css('color', 'black')
        icon.attr('src', '../storage/img/ckIconOk.png')
      },
      error: function(e) {
        console.log(e)
      }
    })
  } else {
    text.html('이메일 형식에 맞게 입력해 주세요.').css('color', 'red')
    icon.attr('src', '../storage/img/ckIconRed.png')
  }
})


// Search info Page
$('.login-side-bar .sign-up-link').on('click', function() {
  $('.login-side-bar .sign-up-link').addClass('side-bar-btn-hidden')
  $('.login-side-bar .search-info-link').removeClass('side-bar-btn-hidden')
  $('.search-info').addClass('main-view-hidden')
  $('.sign-up').removeClass('main-view-hidden')
})

$('.search-id-btn').on('click', function() {
  const currentData = {
    name: $('#search-id-name').val().trim(),
    regno: $('#search-id-regno').val().trim()
  }

  if(currentData.name !== "" && currentData.regno !== "") {
    $.ajax({
      url: "/",
      data: currentData,
      method: 'post',
      success: function(res) {
        console.log(res)
      },
      error: function(e) {
        console.log(e)
      }
    })
  } else {
    $('.print-id').html('이름과 주민번호를 입력해 주세요.').css('color', 'red')
  }
})

$('.reset-pw-btn').on('click', function() {
  const currentData = {
    id: $('#reset-pw-id').val().trim(),
    name: $('#reset-pw-name').val().trim(),
    regno: $('#reset-pw-regno').val().trim()
  }

  if(currentData.id !== "" &&
    currentData.name !== "" &&
    currentData.regno !== "") {
      $.ajax({
        url: "/",
        data: currentData,
        method: 'post',
        success: function(res) {
          console.log(res)
        },
        error: function(e) {
          console.log(e)
        }
      })
    } else {
      $('.print-info').html('아이디, 이름, 주민번호를 입력해 주세요.').css('color', 'red')
    }
})